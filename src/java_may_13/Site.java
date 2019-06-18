package java_may_13;


import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@NoArgsConstructor
public class Site {
    private List<List>post;



    public void menu (){
        post=new ArrayList<>();
//        post.add()

        while (true){
            System.out.println("Create post(1),Show all post(2),Show post by type(3),Delete post(4),Find post by type and city(5),Exit(0)");
            switch (scannerInt()){
                case 1:
//                 createPost();
//                 break;
                case 2:
                    ShowAllPost();
                    break;
                case 3:
//                 ShowPostByType();
                    break;
                case 4:
//                 DeletePost();
                    break;
                case 5:
//                 FindPostByTypeAndCity():
                    break;
                case 0:
                    return ;

            }
        }
    }

    private void ShowAllPost() {
        System.out.println();
    }

//    private void createPost() {
//
//     posts.add(new Offer(scannerStr(),
//             "Looking for a chair person ",
//             "Ukr",
//             "Lviv",
//             380968137,
//             "Marian"));
//
//    }

    public int scannerInt(){
        Scanner sc =new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    public String scannerStr() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    }
