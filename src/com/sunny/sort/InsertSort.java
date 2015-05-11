package com.sunny.sort;

public class InsertSort {
	
	public static void insertSort(int[] array){
		
		if(array==null||array.length<2){
			return;
		}
		for(int i=1;i<array.length;i++){
			int currentValue=array[i];
			int j=i-1;
			while(j>=0&&currentValue<array[j]){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=currentValue;
			ArrayUtils.printArray(array);
		}
		
	}

	public static void main(String[] args) {
		int[] array= {49,38,65,97,76,13,27};
		ArrayUtils.printArray(array);
		insertSort(array);
		
		
	}

}
