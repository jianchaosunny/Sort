package com.sunny.sort;

public class SelectSort {

	public static void selectSort(int[] array){
		if(array==null||array.length<2){
			return;
		}
		for(int i=array.length-1;i>0;i--){
			int maxIndex=i;
			for(int j=i-1;j>=0;j--){
				if(array[j]>array[maxIndex]){
					maxIndex=j;
				}
			}
			if(maxIndex!=i){
				int temp=array[i];
				array[i]=array[maxIndex];
				array[maxIndex]=temp;
			}
			ArrayUtils.printArray(array);
		}
	}
	public static void main(String[] args) {
		int[] array= {49,38,65,97,76,13,27};
		ArrayUtils.printArray(array);
		selectSort(array);
	}

}
