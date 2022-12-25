class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        ArrayList<ArrayList<Integer>> ab= new ArrayList<ArrayList<Integer>>();
        
        findcombination(ab,A,B,0,new ArrayList<Integer>());
        
        return ab;
    }
    
    static void findcombination(ArrayList<ArrayList<Integer>> ab,ArrayList<Integer> a , int target, int start , ArrayList<Integer> values){
        
        if(start==a.size()){
            if(target==0){
                ab.add(new ArrayList<>(values));
            }
            return;
        }
        
        if(a.get(start)<=target){
            values.add(a.get(start));
            findcombination(ab,a,target-a.get(start),start,values);
            values.remove(values.size()-1);
            
            
        }
        
         findcombination(ab,a,target,start+1,values);
        
    }
}


/// Use Below Input

4
7 2 6 5
16
