package dataStructure;

/**
 * @className:JosephProblem
 * @description:约瑟夫环形问题
 * @author: renhai
 * @create: 2021-09-23 16:34
 */
public class JosephProblem {
    public static void main(String[] args) {
        LinkedBoy list1 = new LinkedBoy();
        list1.addNum(10);
        list1.showBoyList();
        list1.countBoy(1,2,10);
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
    public void showBoyList() {
        if (first == null) {
            System.out.println("链表没有元素");
            return;
        } else {
            boy curBoy = first;
            while (true) {
                System.out.println("序号为:" + curBoy.getNo());
                if (curBoy.getNext() == first) {
                    break;
                } else {
                    curBoy = curBoy.getNext();
                }
            }
        }
    }
    //元素按照规则出队列

    /**
     * @return void
     * @Author renhai
     * @Description
     * @Date 17:49 2021/9/23
     * @Param [startNo, countNum, nums]
     **/
    public void countBoy(int startNo, int countNum, int nums) {
        //先对数据进行校验
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数输入错误,请重新输入");
            return;
        } else {
            //辅助指针
            boy helper = first;
            //需要创建一个辅助指针helper 事先应该指向环形链表的最后这个节点
            while (true) {
                if (helper.getNext() == first) {
                    break;
                }
                helper = helper.getNext();
            }
            //让first 和 helper位移到正确的位置 移动k-1次
            for (int j = 0; j < startNo - 1; j++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            //当小孩报数时，让first 和 helper 指针同时 的移动  m  - 1 次, 然后出圈
            //这里是一个循环操作，知道圈中只有一个节点
            while (true) {
                if (helper == first) {
                    break;
                } else {
                    for (int j = 0; j < countNum - 1; j++) {
                        first = first.getNext();
                        helper = helper.getNext();
                    }
                    System.out.printf("小孩%d出圈\n", first.getNo());
                    first = first.getNext();
                    helper.setNext(first);
                }
            }
            System.out.printf("最后留在圈中的小孩编号%d \n", first.getNo());
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
