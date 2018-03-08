package cardGameTest;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

import cardGame.Card;
import cardGame.Hand;
import cardGame.Deck;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class HandTest {

	public int[] HandHelper(ArrayList<Card> cards) {

		int[] result = null;

		try {
			
			//	c = structure of class 'Hand'
			Class<?> c = Class.forName("pkgCore.Hand");

			//	the arguments for 'AddCard' is a instance of Card
			Class[] cArgsAddCard = new Class[1];
			cArgsAddCard[0] = cardGame.Card.class;

			//	Create an instance of Hand
			Object inst = c.newInstance();

			//	Find the method 'AddCard' in Hand
			Method mAddCard = c.getDeclaredMethod("AddCard", cArgsAddCard);
			
			//	Make the private method accessible 
			mAddCard.setAccessible(true);
			
			//	Invoke the AddCard method for each card passed into this method
			for (Card card: cards)
			{
				mAddCard.invoke(inst, card);
			}
			
			//	Find the method 'ScoreHand' in 'Hand'
			Method mScore = c.getDeclaredMethod("ScoreHand", null);
			
			//	Invoke 'ScoreHand'.  It returns an array of integers
			result = (int[]) mScore.invoke(inst, null);

			//	easy way to see each score.  not necessary.. but helps
			for (int i : result) {
				System.out.println(i);
			}

		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Test
	public void test1() {
		
		ArrayList<Card> cards = new ArrayList<Card>();
		
		cards.add(new Card(eRank.TWO,eSuit.CLUBS));
		cards.add(new Card(eRank.THREE,eSuit.CLUBS));
		cards.add(new Card(eRank.FOUR,eSuit.CLUBS));
		
		
		int[] score = HandHelper(cards);
		
		//	TODO: Check Score to make sure it's right.  Something close to this:
		assertEquals(score[0],9);	
		fail("the actual value was " + score[0]);
	}

	@Test
	public void test2() {
		// TODO: Test 2-3-J, score should be 15
	}

	@Test
	public void test3() {
		// TODO: Test 2-3-J-J, score should be 25
	}

	@Test
	public void test4() {
		// TODO: Test J-A, score should be 21
	}

	@Test
	public void test5() {
		// TODO: Test J-A-A, score should be 12
	}

	@Test
	public void test6() {
		// TODO: Test J-A-A-A, score should be 13
	}
	
	@Test
	public void test7() {
		//	TODO: Test A-A-A-A-2, score should be 6 or 16
	}

}