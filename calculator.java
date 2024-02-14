
class calculator3
{


    float addition(float operand_1 ,float operand_2 ){
        return(operand_1 + operand_2);
    }

    float substraction(float operand_1 ,float operand_2 ){
        return(operand_1 - operand_2);
    }

    float multiplicaton(float operand_1 ,float operand_2 ){
        return(operand_1 * operand_2);
    }

    float division(float operand_1 ,float operand_2 ){
        return(operand_1 / operand_2);
    }
    float square(float operand_1  ){
        return(operand_1 * operand_1);
    }

    float cube(float operand_1  ){
        return((operand_1 * operand_1)*operand_1);
    }

  

    public static void main(String[] args){
        float operand_1= 10;
        float operand_2= 5;
         calculator3 cal = new calculator3();

         float add_result = cal.addition(operand_1,operand_2);
         System.out.println("Result of Addition:"+ add_result);

         float sub_result = cal.substraction(operand_1,operand_2);
         System.out.println("Result of Addition:"+ sub_result);

         float mal_result = cal.multiplicaton(operand_1,operand_2);
         System.out.println("Result of Addition:"+ mal_result);

         float div_result = cal.division(operand_1,operand_2);
         System.out.println("Result of Addition:"+ div_result);

         float div_square = cal.square(operand_1);
         System.out.println("Result of Addition:"+ div_square);

         float div_cube = cal.cube(operand_1);
         System.out.println("Result of Addition:"+ div_cube);
    }
}