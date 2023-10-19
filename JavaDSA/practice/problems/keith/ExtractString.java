package practice.problems.keith;

import java.util.ArrayList;
import java.util.List;

public class ExtractString {
	public int findNumberAndAdd(String conversation){
	      List<Integer> numbers = new ArrayList<>();
	      if(conversation.toUpperCase().contains("ONE")){
	        numbers.add(1);
	      }
	      if(conversation.toUpperCase().contains("TWO")){
	        numbers.add(2);
	      }
	      if(conversation.toUpperCase().contains("THREE")){
	        numbers.add(3);
	      }
	      if(conversation.toUpperCase().contains("FOUR")){
	        numbers.add(4);
	      }
	      if(conversation.toUpperCase().contains("FIVE")){
	        numbers.add(5);
	      }
	      if(conversation.toUpperCase().contains("SIX")){
	        numbers.add(6);
	      }
	      if(conversation.toUpperCase().contains("SEVEN")){
	        numbers.add(7);
	      }
	      if(conversation.toUpperCase().contains("EIGHT")){
	        numbers.add(8);
	      }
	      if(conversation.toUpperCase().contains("NINE")){
	        numbers.add(9);
	      }
	      return numbers.stream().mapToInt(Integer::intValue).sum();
	    }
}
