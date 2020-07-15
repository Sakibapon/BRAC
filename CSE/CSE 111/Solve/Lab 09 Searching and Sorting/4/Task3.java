class Task3 {

    public static void main (String[]args) {

        DataLinkedList dll = new DataLinkedList();
        dll.add(15);
        dll.add(19);
        dll.add(35);
        dll.add(6);
        dll.add(2);
        dll.add(14);
        dll.printData();
        dll.sort();
        dll.printData();
    }
}