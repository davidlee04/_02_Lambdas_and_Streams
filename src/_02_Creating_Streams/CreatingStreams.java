package _02_Creating_Streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		String[] strArr = {"one", "two", "three", "four"};
		Stream stream = Arrays.stream(strArr);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		Stream stream2 = intList.stream();
		
		Stack<Random> randStack = new Stack<Random>();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		
		Stream stream3 = randStack.stream();
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		
		Stream stream4 = dQueue.stream();
	}
}
