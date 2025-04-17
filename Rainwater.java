public class Rainwater {
    public static int trappedRainwater(int height[]){
        int n = height.length;
        //CALCULATE LEFT MAX BOUNDARY - ARRAY
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1;i < height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //CALCULATE RIGHT MAX BOUNDARY - ARRAY
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i >= 0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trappedRainwater = 0;

        //LOOP
        for(int i = 0;i < n;i++){
            // WATER LEVEL = MIN(LEFT MAX BOUNDARY,RIGHT MAX BOUNDARY)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //TRAPPED WATER = WATER LEVEL - HEIGHT[i]
            trappedRainwater += waterLevel - height[i];
        }
        return trappedRainwater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
