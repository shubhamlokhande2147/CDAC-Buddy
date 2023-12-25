

namespace stackDSA;

public class Stack : ICloneable
{
    private int size;
    private int[] arr;
    static int cnt;
    public Stack()
    {
        this.size = 5;
        this.arr = new int[size];
        cnt = -1;
    }

    public Stack(int size)
    {
        this.size = size;
        this.arr = new int[this.size];
        cnt = 0;
    }
    public bool isFull()
    {
        if (cnt == size)
        {
            return true;
        }
        return false;
    }
    public bool isNull()
    {
        if (cnt == -1)
        {
            return true;
        }
        return false;
    }
    public void push(int n)
    {
        if (isFull())
        {
            Console.WriteLine("Can not push element....");
            return;
        }
        else
        {
            cnt++;
            arr[cnt] = n;

        }
    }
    public int pop()
    {
        if (isNull())
        {
            Console.WriteLine("Cannot popped element...");
            return -1; 
        }
        else
        {
            int ele = arr[cnt];
            cnt--;
            Console.WriteLine(ele + " popped from stack");
            return ele;
        }
    }
    public void Print()
    {
        for (int i = 0; i < cnt; i++)
        {
            Console.WriteLine(arr[i]);
        }
    }
    public object Clone()
    {
        Stack replica = new Stack(this.size);
        this.arr.CopyTo(replica.arr,0); //copyTo (array,index)
        Console.WriteLine("Object two is created");
        return replica;
    }
}