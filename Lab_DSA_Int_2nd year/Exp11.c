#include<stdio.h>
#include <stdlib.h>
struct Node
{ 
int data; 
struct Node *left; 
struct Node *right;
};
struct Node* createNode(int n)
{
    struct Node newnode=(struct Node)malloc(sizeof(struct Node));
    if(newnode==NULL)
    {
        printf("Memory allocation failed!");
        return NULL;
    }
    newnode->data=n;
    newnode->left=NULL;
    newnode->right= NULL;
    return newnode;
}
void insert( struct Node** root, int data)
{
    struct Node* newNode = createNode(data);
    if (*root == NULL) {
        *root = newNode;
        return;
    }

    // Level order traversal to find the appropriate place
    // for insertion
    struct Node* temp;
    struct Node* queue[100];
    int front = -1, rear = -1;
    queue[++rear] = *root;

    while (front != rear) {
        temp = queue[++front];

        //  Insert new node as the left child
        if (temp->left == NULL) {
            temp->left = newNode;
            return;
        }
        // if left child is not missing push it to the queue
        else {
            queue[++rear] = temp->left;
        }
        // Insert new node as the right child
        if (temp->right == NULL) {
            temp->right = newNode;
            return;
        }
        // if right child is not missing push it to the
        // queue
        else {
            queue[++rear] = temp->right;
        }
    }
}
void inOrderTraversal(struct Node* root) {
    if (root == NULL) 
        return;

    // Traverse the left subtree
    inOrderTraversal(root->left);

    // Visit the root node
    printf("%d ", root->data);

    // Traverse the right subtree
    inOrderTraversal(root->right);
}
void preOrderTraversal(struct Node* root) {
    if (root == NULL) 
        return;

    // Visit the root node
    printf("%d ", root->data);

    // Traverse the left subtree
    preOrderTraversal(root->left);

    // Traverse the right subtree
    preOrderTraversal(root->right);
}
void postOrderTraversal(struct Node* root) {
    if (root == NULL) 
        return;

    // Traverse the left subtree
    postOrderTraversal(root->left);

    // Traverse the right subtree
    postOrderTraversal(root->right);

    // Visit the root node
    printf("%d ",root->data);
}

int main()
{
    struct Node* root = NULL;
    int a[10],i;
    printf("Enter 10 no.s:");
    for(i=0;i<10;i++)
        scanf("%d",&a[i]);
    for(i=0;i<10;i++)
        insert(&root,a[i]);
    do
    {
        printf("\nTree Traversal!\n");
        printf("1: In-order\n");
        printf("2: Pre-order\n");
        printf("3: Post-order\n");
        printf("4: Exit\n");
        printf("\nEnter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            printf("Inorder traversal of the given Binary Search "
           "Tree is: \n");
            inOrderTraversal(root);
            printf("\n");
            break;
        case 2:
            printf("Pre-order traversal of the given Binary Search "
           "Tree is: \n");
            preOrderTraversal(root);
            printf("\n");
            break;
        case 3:
            printf("Post-order traversal of the given Binary Search "
           "Tree is: \n");
            postOrderTraversal(root);
            printf("\n");
            break;
        case 4:
            printf("Thank you!!");
            exit(0);
        default:
            printf("Invalid choice!");
        }
        printf("\n");
    } while (ch!=0);
    return 0;
}
/*Enter 10 no.s:1 2 3 4 5 6 7 8 9 0  
Inorder traversal of the given Binary Search Tree is: 
8 4 9 2 0 5 1 6 3 7 
Pre-order traversal of the given Binary Search Tree is: 
1 2 4 8 9 5 0 3 6 7 
Post-order traversal of the given Binary Search Tree is: 
8 9 4 0 5 2 6 7 3 1*/