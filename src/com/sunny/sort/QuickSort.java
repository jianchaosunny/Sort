package com.sunny.sort;

public class QuickSort {
	
	public static void quickSort(int[] array){
		subQuickSort(array, 0, array.length-1);
	}
	
	public static void subQuickSort(int[] array,int start,int end){
		if (array==null||(end-start+1)<2){
			return ;
		}
		int part = partition(array, start, end);
		
		if(part==start){
			subQuickSort(array, part+1, end);
		}else if (part==end){
			subQuickSort(array, start, part-1);
		}else{
			subQuickSort(array, start, part-1);
			subQuickSort(array, part+1, end);
		}
		
	}
	
	public static int partition(int[] array,int start,int end){
		int index=start-1;
		int value = array[end];
		
		for(int i=start;i<end;i++){
			if(array[i]<value){
				index++;
				if(index!=i){
					ArrayUtils.exchangeElements(array, index, i);
				}
			}
		}
		if(index+1!=end){
			ArrayUtils.exchangeElements(array, index+1,end);
		}
		ArrayUtils.printArray(array);
		return index+1;
	}
	
	public static void main(String[] args) {
		int[] array= { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };
		ArrayUtils.printArray(array);
		quickSort(array);
		ArrayUtils.printArray(array);
	}

}
