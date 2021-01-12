/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* left;
    Node* right;
    Node* next;

    Node() : val(0), left(NULL), right(NULL), next(NULL) {}

    Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

    Node(int _val, Node* _left, Node* _right, Node* _next)
        : val(_val), left(_left), right(_right), next(_next) {}
};
*/

class Solution {
   public:
    Node* connect(Node* root) {
        queue<Node*> que;
        Node* proot = root;
        if (root == NULL) {
            return root;
        }
        que.push(root);
        while (!que.empty()) {
            int len = que.size();
            while (len) {
                Node* temp = que.front();
                que.pop();
                len--;
                if (len) {
                    temp->next = que.front();
                }
                if (temp->left) {
                    que.push(temp->left);
                }
                if (temp->right) {
                    que.push(temp->right);
                }
            }
        }
        return proot;
    }
};