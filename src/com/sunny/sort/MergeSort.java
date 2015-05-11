/**  
 * @Title: MergeSort.java
 * @Package com.sunny.sort
 * @Description: TODO(用一句话描述该文件做什么)
 * @author sunjianchao  
 * @date 2015年5月11日 上午11:17:41
 * @version V1.0  
 */
package com.sunny.sort;

/**
 * @ClassName: MergeSort
 * @Description: 归并排序，将两个或者两个以上的有序表合并成一个新的有序表，
 *               即把待排序序列分为若干个子序列，每个子序列是有序地，然后再把有序子序列合并为整体有序序列。
 * @author sunjianchao
 * @date 2015年5月11日 上午11:17:41
 */
public class MergeSort {

	public static int[] sort(int[] nums, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			sort(nums, low, mid);
			sort(nums, mid + 1, high);
			merge(nums, low, mid, high);
		}
		return nums;
	}

	public static void merge(int[] nums, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// 左指针
		int j = mid + 1;// 右指针
		int k = 0;

		while (i <= mid && j <= high) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = nums[i++];
		}
		while (j <= high) {
			temp[k++] = nums[j++];
		}

		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2 + low] = temp[k2];
		}
		ArrayUtils.printArray(nums);
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };
		ArrayUtils.printArray(nums);
		sort(nums, 0, nums.length - 1);

	}

}
