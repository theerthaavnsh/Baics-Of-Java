
interface Sports 
{
    float sportwt = 6.0F; 

    void putwt(); 
}


class Student 
{
    int rollnumber;

    void getNumber(int rollnumber)
    
     {
        this.rollnumber = rollnumber;
    }

    void putNumber() {
        System.out.println("Roll No: " + rollnumber);
    }
}


class Test extends Student implements Sports 
{
    float term1, term2;

    void getMarks(float term1, float term2) 
    {
        this.term1 = term1;
        this.term2 = term2;
    }

    void putMarks() 
    {
        System.out.println("Marks obtained");
        System.out.println("Term 1 = " + term1);
        System.out.println("Term 2 = " + term2);
    }

    @Override
    public void putwt() 
    {
        System.out.println("Sports weightage = " + sportwt);
    }
}


class Results extends Test 
{
    void display() 
    {
        putNumber();
        putMarks();
        putwt();
        float totalScore = term1 + term2 + sportwt;
        System.out.println("Total Score = " + totalScore);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Results result = new Results();
        result.getNumber(12);
        result.getMarks(27.5F, 33F);
        result.display();
    }
}

