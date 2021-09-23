package dataStructure;

/**
 * @className:JosephProblem
 * @description:约瑟夫环形问题
 * @author: renhai
 * @create: 2021-09-23 16:34
 */
public class JosephProblem {
    public static void main(String[] args) {
        LinkedBoy list1=new LinkedBoy();
        list1.addNum(10);
        list1.showBoyList();
    }

}

class LinkedBoy {
    private boy first = null;

    //添加环形小孩列表
    public void addNum(int num) {
        if (num < 1) {
            System.out.println("没有小孩添加,请输入大于等于1的小孩个数");
            return;
        } else {
            boy curBoy = null;
            for (int i = 1; i <= num; i++) {
                boy boy = new boy(i);
                if (i == 1) {
                    first = boy;
                    first.setNext(first);
                    curBoy = first; // 让curBoy指向第一个小孩
                } else {
                    curBoy.setNext(boy);
                    boy.setNext(first);
                    curBoy = boy;
                }
            }
        }
    }
    //遍历环形链表
    public void showBoyList()
    {
        if (first==null)
        {
            System.out.println("链表没有元素");
            return;
        }else
        {
            boy curBoy=first;
            while (true)
            {
                System.out.println("序号为:"+curBoy.getNo());
                if (curBoy.getNext()==first)
                {
                    break;
                }else
                {
                    curBoy=curBoy.getNext();
                }
            }
        }
    }
}

/**
 * @Author renhai
 * @Description 小孩类
 * @Date 16:54 2021/9/23
 * @Param
 * @return
 **/
class boy {
    private int no;
    private boy next;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boy getNext() {
        return next;
    }

    public void setNext(boy next) {
        this.next = next;
    }

    public boy(int no) {
        this.no = no;
    }
}
