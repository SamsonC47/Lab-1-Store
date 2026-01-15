import java.util.ArrayList;

public class Store {

    public ArrayList<CISItem> cisItems;

    public Store(){
        cisItems = new ArrayList<>();
    }

    public void addBook(Book book){
        cisItems.add(book);
    }

    public void addPhone(Phone phone){
        cisItems.add(phone);
    }
    public void addMagazine(Magazine magazine){
        cisItems.add(magazine);
    }
    public void addArduino(Arduino arduino){
        cisItems.add(arduino);
    }

    public void updateLocation(String location){
        for(CISItem i:cisItems){
            if(i instanceof Phone){
                i.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getPhones(){
        ArrayList<Phone> allPhones = new ArrayList<>();
        for(CISItem i : cisItems){
            if(i instanceof Phone){
                allPhones.add((Phone) i);
            }
        }
        return allPhones;
    }

    public ArrayList<Magazine> getAllMagazines(){
        ArrayList<Magazine> allMagazines = new ArrayList<>();
        for(CISItem i: cisItems){
            if(i instanceof Magazine){
                allMagazines.add((Magazine)i);
            }
        }
        return  allMagazines;
    }

    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> allBooks = new ArrayList<>();
        for(CISItem i:cisItems){
            if(i instanceof Book){
                allBooks.add((Book)i);
            }
        }
        return allBooks;
    }

    public ArrayList<CISItem> getItems(String Type){
        ArrayList<CISItem> targetItems = new ArrayList<>();
        for(CISItem i : cisItems){
            if (Type.equalsIgnoreCase("book") && i instanceof Book){
                targetItems.add(i);
            }else if(Type.equalsIgnoreCase("magazine") && i instanceof Magazine){
                targetItems.add(i);
            }else if(Type.equalsIgnoreCase("phone") && i instanceof Phone){
                targetItems.add(i);
            }else if(Type.equalsIgnoreCase("Arduino") && i instanceof Arduino){
                targetItems.add(i);
            }else if(Type.equalsIgnoreCase("readingitem") && i instanceof ReadingItem){
                targetItems.add(i);
            }else if(Type.equalsIgnoreCase("electronicitem") && i instanceof ElectronicItem){
                targetItems.add(i);
            }
        }
        return targetItems;
    }

    public void updateItems(String itemType, String property, String value){

        for(CISItem i : cisItems){
            String className = i.getClass().getSimpleName().toLowerCase();

            if(className.equals(itemType)){
                if(property.equalsIgnoreCase("name")){
                    i.setName(value);
                }else if(property.equalsIgnoreCase("location")){
                    i.setLocation(value);
                }else if(property.equalsIgnoreCase("description")){
                    i.setDescription(value);
                }else if(property.equalsIgnoreCase("price")){
                    i.setPrice(Integer.parseInt(value));
                }
            }
        }
    }

    public void showALlInfo(){
        System.out.print("All items in the store:");
        for(CISItem i: cisItems){
            System.out.println(i);
        }
    }

    public void addItems(CISItem cisItem){
        cisItems.add(cisItem);
    }

}
