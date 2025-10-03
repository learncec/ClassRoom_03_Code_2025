public class ClassRoom
{
    private String roomNr;
    private boolean computer;
    private int size;
    
     public ClassRoom(String roomNr, boolean computer, int size)
    {
        setRoomNr(roomNr);
        setComputer(computer);
        setSize(size);
    }
    public ClassRoom(String roomNr, boolean computer)
    {
        setRoomNr(roomNr);
        setComputer(computer);
        setSize(25);
    }
    public ClassRoom(String roomNr)
    {
        setRoomNr(roomNr);
        setComputer(false);
        setSize(25);
    }
    public ClassRoom()
    {
        setRoomNr("C1.10");
        setComputer(false);
        setSize(25);
    }
    
    public void setRoomNr(String roomNr)
    {
        this.roomNr = roomNr;
    }
        public void setComputer(boolean computer)
    {
        this.computer = computer;
    }
        public void setSize(int size)
    {
        this.size = size;
    }
    
    public String getRoomNr()
    {
        return roomNr;
    }
        public boolean getComputer()
    {
        return computer;
    }
        public int getSize()
    {
        return size;
    }
    
    //if-Abfrage- Eigenschaft-computer-entweder ja, es gibt Computern oder nein, es gibt kein Computer
    public void  printClassRoom()
    {
        if(computer == true)
        {
        System.out.println("Der Klassenraum befindet sich: " + roomNr + ", ja, es gibt Computer in dem Raum, und es gibt insgesamt " + size + " Sitzplätze.");
        }
        else{
        System.out.println("Der Klassenraum befindet sich: " + roomNr + ", nein, es gibt kein Computer in dem Raum, und es gibt insgesamt " + size + " Sitzplätze.");
        }
    }
}