class humanBody {
    public void displayHuman() {
        System.out.println("Human body");
    }
}

interface male {
    public void show();
}

interface female {
    public void show();
}

class hybrid extends humanBody implements male, female {
    public static void main(String[] args) {
        
    }

}