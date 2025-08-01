class BSTIterator {
   Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        insert(root);
    }
    public void insert(TreeNode root){
        while(root != null){
            st.push(root);
            root = root.left;
        }
    }
    public int next() {
        TreeNode topNode = st.peek();
        st.pop();
        int answer = topNode.val;
        if(topNode.right != null){
            insert(topNode.right);
        }
        return answer;
    }
    
    public boolean hasNext() {
        return (st.size() == 0? false:true);
    }
}