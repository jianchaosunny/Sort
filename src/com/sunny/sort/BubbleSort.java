package com.sunny.sort;

public class BubbleSort {

	public static void bubbleSort(int[] array){
		if(array==null||array.length<2){
			return;
		}
		for(int i=array.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j+1]<array[j]){
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
			ArrayUtils.printArray(array);
		}
	}
	public static void main(String[] args) {
		int[] array= {49,38,65,97,76,13,27};
		ArrayUtils.printArray(array);
		bubbleSort(array);
	}

}
