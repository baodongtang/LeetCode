import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: 数组中的第K个最大的元素
 * @author: tang bd
 * @create: 2021-12-22 10:34
 */
public class FindKthLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的数组：");
        String str = scanner.nextLine();
//        str = str.replaceAll("[^0-9a-z]",""); //字符串替换
        int[] num = stringToIntegerArray(str);
        System.out.println("该数组中第k个最大的元素为：");
        System.out.println(findKthLargest(num,3));

    }

    //基于堆排序
    public static int findKthLargest(int[] nums, int k) {
        //基于堆排序的选择方法
        int heapSize=nums.length;
        buildMaxHeap(nums,heapSize);//构建一个大顶堆
        //循环k-1次
        for(int i=nums.length-1;i>=nums.length-k+1;--i){
            swap(nums,0,i);//将堆顶元素放到最后
            --heapSize;//堆大小-1，即删除原来的堆顶元素
            maxHeapify(nums,0,heapSize);//重建堆
        }
        return nums[0];
    }
    public static void buildMaxHeap(int[] a, int heapSize){
        for(int i=heapSize/2;i>=0;--i){
            maxHeapify(a,i,heapSize);
        }
    }

    public static void maxHeapify(int[] a, int i, int heapSize){
        int l=i*2+1,r=i*2+2,largest=i;
        if(l<heapSize&&a[l]>a[largest]){
            largest=l;
        }
        if(r<heapSize&&a[r]>a[largest]){
            largest=r;
        }
        if(largest!=i){
            swap(a,i,largest);
            maxHeapify(a,largest,heapSize);
        }
    }

    public static void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    private static int[] stringToIntegerArray(String str){
        String[] numStr = str.split(" ");
        int[] numInt = new int[numStr.length];

        for (int i =0; i < numStr.length; i++){
            try {
                numInt[i] = Integer.parseInt(numStr[i]);
            }catch (NumberFormatException e){
                e.printStackTrace();
                return numInt;
            }
        }
        return numInt;
    }
}