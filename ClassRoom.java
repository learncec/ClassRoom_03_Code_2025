public class ClassRoom
{
    private String roomNr;
    private boolean computer;
    private int size;
    
     public ClassRoom(String newRoomNr, boolean newComputer, int newSize)
    {
        setRoomNr(newRoomNr);
        setComputer(newComputer);
        setSize(newSize);
    }
    
    public void setRoomNr(String newRoomNr)
    {
        roomNr = newRoomNr;
    }
    
    public void setComputer(boolean newComputer)
    {
        computer = newComputer;
    }
    
    public void setSize(int newSize)
    {
        size = newSize;
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
    
    public void  printClassRoom()
    {
        System.out.println("Classroom " + roomNr + " - Computer: " + computer + " - " + size + " Students");
    }
}