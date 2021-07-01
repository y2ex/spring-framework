package cc.y2ex.aop.learn;


import org.springframework.aop.framework.AopContext;

public class Y2exCalculate implements Calculate{


    public int add(int numA, int numB) {
        System.out.println("execute method:add");
        //System.out.println(1/0);
        return numA+numB;
    }

    public int reduce(int numA, int numB) {
        System.out.println("execute method:reduce");
        return numA-numB;
    }

    public int div(int numA, int numB) {
        System.out.println("execute method:div");

        return numA/numB;
    }

    public int multi(int numA, int numB) {
        System.out.println("execute method:multi");

        return numA*numB;
    }

    public int mod(int numA,int numB){
        System.out.println("执行目标方法:mod");

		int retVal = ((Calculate)AopContext.currentProxy()).add(numA,numB);
        //int retVal = this.add(numA,numB);

        return retVal%numA;

        //return numA%numB;
    }

}
