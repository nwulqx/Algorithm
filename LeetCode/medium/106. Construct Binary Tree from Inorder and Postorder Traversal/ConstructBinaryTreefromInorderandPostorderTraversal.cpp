/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
   public:
    TreeNode* buildTree(int inL, int inR, int postL, int postR, vector<int>& inorder, vector<int>& postorder) {
        if (inL > inR || postL > postR) {
            return NULL;
        }
        TreeNode* root = new TreeNode(postorder[postR]);
        int k = inL;
        while (k <= inR && inorder[k] != postorder[postR]) {
            k++;
        }
        int numL = k - inL;
        root->left = buildTree(inL, k - 1, postL, postL + numL - 1, inorder, postorder);
        root->right = buildTree(k + 1, inR, postL + numL, postR - 1, inorder, postorder);
        return root;
    }
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        int len = inorder.size() - 1;
        TreeNode* root = buildTree(0, len, 0, len, inorder, postorder);
        return root;
    }
};