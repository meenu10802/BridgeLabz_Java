package datastructure.linkedlist;

/*
7. Singly Linked List: Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list.
*/

class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        friendId = id;
        next = null;
    }
}

class UserNode {
    int userId, age;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

public class SocialMediaFriends {

    UserNode head;

    // Add user
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Display users
    void displayUsers() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.userId + " " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaFriends sm = new SocialMediaFriends();
        sm.addUser(1, "Kaviya", 20);
        sm.addUser(2, "Anu", 21);

        sm.displayUsers();
    }
}
