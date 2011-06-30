import checkers.igj.quals.*;

//./bin/javac -processor checkers.igj.IGJChecker -d classes src/Data.java 
@Immutable class Data {
    int time; 

    public Data(int time)  {
        this.time = time;
    }

    public int getYear() { return 0; }
    public int getMonth() { return 0; }
    public int getDay() { return 0; }

    public int testMutate() {
        this.time = 4;  //compile error
        this.time++;    //compile error
        return this.time;
    }

}

