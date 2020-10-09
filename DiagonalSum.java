package exercise720;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

	class Result {

	    public static int diagonalDifference(List<List<Integer>> arr) {
	           int sum = 0;
	            int sum2 = 0;
	          

	            for(int i = 0; i < arr.size(); i++){
	                for(int j = 0; j < arr.size(); j++){
	                    if(i == j){
	                        sum = sum + arr.get(i).get(j);
	                    }
	                }
	            }
	           // System.out.println(sum);
	            
	            for(int i = 1; i <= arr.size(); i++){
	                for(int j = 0; j < 1; j++){
	                       sum2 = sum2 + (arr.get(i-1).get((arr.size() - i)));
	                        
	                    }
	            }
	                return  Math.abs(sum2 - sum);       
	}
	}

	public class DiagonalSum {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        IntStream.range(0, n).forEach(i -> {
	            try {
	                arr.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        int result = Result.diagonalDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}


//    public static void main(String args[]){
//
//        List<ArrayList<Integer>> a = new ArrayList<>();
//
//        ArrayList<Integer> a1 = new ArrayList<Integer>();
//        ArrayList<Integer> a2 = new ArrayList<Integer>();
//        ArrayList<Integer> a3 = new ArrayList<Integer>();
//
//
//        a1.add(11);
//        a1.add(2);
//        a1.add(4);
//        
////        11 , 2, 4
////        4, 5, 6,
////        10, 8, -12
//        a2.add(4);
//        a2.add(5);
//        a2.add(6);
//
//        a3.add(10);
//        a3.add(8);
//        a3.add(-12);
//
//        a.add(a1);
//        a.add(a2);
//        a.add(a3);
//        
//
//       System.out.println( DiagonalSum.diagonalDifference(a));
//    }
//        
//        public static int diagonalDifference(List<ArrayList<Integer>> a) {
//	        int sum = 0;
//	        int sum2 = 0;
//	      
//
//	        for(int i = 0; i < a.size(); i++){
//	            for(int j = 0; j < a.size(); j++){
//	                if(i == j){
//	                    sum = sum + a.get(i).get(j);
//	                }
//	            }
//	        }
//	       // System.out.println(sum);
//	        System.out.println(a.size());
//	        
//	        for(int i = 1; i <= a.size(); i++){
//	            for(int j = 0; j < 1; j++){
//	                   sum2 = sum2 + (a.get(i-1).get((a.size() - i)));
//	                    
//	                }
//	        }
//	       // System.out.println(sum2);
//
//	        
//	        return sum2 - sum;
//	    }

