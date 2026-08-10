class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer> temp=new Stack<>();
        int x;
        while(!st.isEmpty())
        {
            x=st.pop();
            while(!temp.isEmpty() && temp.peek()<x)
            {
                st.push(temp.pop());
            }
            temp.push(x);
        }
        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }
    
    }
}