
```
public class LinkedListCycleDetection {

    // সাইকেল আছে কি না তা চেক করার জন্য মেথড
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // লিস্ট ফাঁকা বা একটি মাত্র নোড থাকলে সাইকেল নেই
        }

        Node slow = head; // ধীর পয়েন্টার
        Node fast = head; // দ্রুত পয়েন্টার

        // পয়েন্টারগুলো চলতে থাকবে যতক্ষণ না তারা একে অপরকে ক্রস করে
        while (fast != null && fast.next != null) {
            slow = slow.next;          // ধীর পয়েন্টার এক ধাপ এগোয়
            fast = fast.next.next;     // দ্রুত পয়েন্টার দুই ধাপ এগোয়

            if (slow == fast) {
                return true; // যদি ধীর ও দ্রুত পয়েন্টার এক পজিশনে আসে, সাইকেল আছে
            }
        }

        return false; // যদি কোনো পয়েন্টে ধীর ও দ্রুত পয়েন্টার মেলে না, সাইকেল নেই
    }
```
ব্যাখ্যা
hasCycle মেথড: ফ্লয়েডের অ্যালগরিদম অনুসারে দুইটি পয়েন্টার ব্যবহার করা হয়। যদি তারা কোনো পয়েন্টে এসে মিলে যায়, তাহলে বোঝা যায় যে লিঙ্কড লিস্টে সাইকেল আছে।
