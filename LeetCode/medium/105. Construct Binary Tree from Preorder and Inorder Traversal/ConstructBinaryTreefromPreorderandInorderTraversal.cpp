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
    TreeNode* buildTree(int inL, int inR, int preL, int preR, vector<int>& preorder, vector<int>& inorder) {
        if (inL > inR || preL > preR) {
            return NULL;
        }
        TreeNode* root = new TreeNode(preorder[preL]);
        int k = inL;
        while (k <= inR && inorder[k] != preorder[preL]) {
            k++;
        }
        int numL = k - inL;
        root->left = buildTree(inL, k - 1, preL + 1, preL + numL, preorder, inorder);
        root->right = buildTree(k + 1, inR, preL + numL + 1, preR, preorder, inorder);
        return root;
    }
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        int len = inorder.size() - 1;
        TreeNode* root = buildTree(0, len, 0, len, preorder, inorder);
        return root;
    }
};