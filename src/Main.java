void main() {
    Scanner sc = new Scanner(System.in);
    AnimalDoubleLinkedList list = new AnimalDoubleLinkedList();

    list.add(new Zvire("nosal", "savec", 12));
    list.add(new Zvire("zebra", "savec", 5));
    list.add(new Zvire("jezek", "savec", 15));
    list.add(new Zvire("pes", "savec", 7));
    list.add(new Zvire("emu", "ptak", 6));

    while(true){
        try{
            System.out.println("----------MENU----------");
            System.out.println("1. Add an animal to the first place on the list.");
            System.out.println("2. Add an animal to the last place on the list.");
            System.out.println("3. Print all animals from the list.");
            System.out.println("4. Remove the first animal in the list.");
            System.out.println("5. Print all animals are over 5 years old.");
            System.out.println("6. Print the oldest animal in the list.");
            System.out.println("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("-----ADD ANIMAL (FIRST)-----\n");
                    System.out.println("Enter animal name:");
                    String jm = sc.nextLine();
                    System.out.println("Enter animal species:");
                    String dr = sc.nextLine();
                    System.out.println("Enter animal age:");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Adding the animal on first place in the list...");
                    Thread.sleep(1000);
                    list.addFirst(new Zvire(jm,dr,age));
                    System.out.println("Animal added successfully!");
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("-----ADD ANIMAL (LAST)-----\n");
                    System.out.println("Enter animal name:");
                    String j = sc.nextLine();
                    System.out.println("Enter animal species:");
                    String d = sc.nextLine();
                    System.out.println("Enter animal age:");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Adding the animal on first place in the list...");
                    Thread.sleep(1000);
                    list.add(new Zvire(j,d,a));
                    System.out.println("Animal added successfully!");
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("-----PRINT ALL ANIMALS-----\n");
                    list.printAll();
                    System.out.println("-------------------------");
                    break;
                case 4:
                    System.out.println("-----REMOVE FIRST ANIMAL-----\n");
                    System.out.println("Removing the animal on first place in the list...");
                    Thread.sleep(1000);
                    list.removeFirst();
                    System.out.println("Animal removed successfully!");
                    System.out.println("-------------------------");
                    break;
                case 5:
                    System.out.println("-----PRINT ALL ANIMALS OVER 5 YEARS OLD-----\n");
                    list.printAllOverFiveYo();
                    System.out.println("-------------------------");
                    break;
                case 6:
                    System.out.println("-----PRINT THE OLDEST ANIMALS-----\n");
                    System.out.println("Finding the oldest animal in the list...");
                    Thread.sleep(1000);
                    list.printTheOldestAnimal();
                    System.out.println("Animal found successfully!");
                    System.out.println("-------------------------");
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid input!");
            sc.nextLine();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
