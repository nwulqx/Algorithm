class Codec {
   public:
    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        if (root == NULL)
            return "#_";
        string res = to_string(root->val) + "_";
        res += serialize(root->left);
        res += serialize(root->right);
        return res;
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        std::stringstream ss(data);
        std::string item;
        queue<string> q;
        while (std::getline(ss, item, '_'))
            q.push(item);
        return helper(q);
    }
    TreeNode* helper(queue<string>& q) {
        string val = q.front();
        q.pop();
        if (val == "#")
            return NULL;
        TreeNode* head = new TreeNode(stoi(val));
        head->left = helper(q);
        head->right = helper(q);
        return head;
    }
};