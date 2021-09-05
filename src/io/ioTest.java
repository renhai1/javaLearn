package io;

import org.junit.Test;

import java.io.File;

/**
 * @className:ioTest
 * @description: file类的讲解
 * @author: renhai
 * @create: 2021-09-05 19:59
 */
public class ioTest {
    @Test
    public void test1()
    {
        /**
         * 方法
         *
         * boolean canExecute()
         * 测试应用程序是否可以执行此抽象路径名表示的文件。
         * boolean canRead()
         * 测试应用程序是否可以读取由此抽象路径名表示的文件。
         * boolean canWrite()
         * 测试应用程序是否可以修改由此抽象路径名表示的文件。
         * int compareTo(File pathname)
         * 比较两个抽象的路径名字典。
         * boolean createNewFile()
         * 当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
         * static File createTempFile(String prefix, String suffix)
         * 在默认临时文件目录中创建一个空文件，使用给定的前缀和后缀生成其名称。
         * static File createTempFile(String prefix, String suffix, File directory)
         * 在指定的目录中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名称。
         * boolean delete()
         * 删除由此抽象路径名表示的文件或目录。
         * void deleteOnExit()
         * 请求在虚拟机终止时删除由此抽象路径名表示的文件或目录。
         * boolean equals(Object obj)
         * 测试此抽象路径名与给定对象的相等性。
         * boolean exists()
         * 测试此抽象路径名表示的文件或目录是否存在。
         * File getAbsoluteFile()
         * 返回此抽象路径名的绝对形式。
         * String getAbsolutePath()
         * 返回此抽象路径名的绝对路径名字符串。
         * File getCanonicalFile()
         * 返回此抽象路径名的规范形式。
         * String getCanonicalPath()
         * 返回此抽象路径名的规范路径名字符串。
         * long getFreeSpace()
         * 返回分区未分配的字节数 named此抽象路径名。
         * String getName()
         * 返回由此抽象路径名表示的文件或目录的名称。
         * String getParent()
         * 返回此抽象路径名的父 null的路径名字符串，如果此路径名未命名为父目录，则返回null。
         * File getParentFile()
         * 返回此抽象路径名的父，或抽象路径名 null如果此路径名没有指定父目录。
         * String getPath()
         * 将此抽象路径名转换为路径名字符串。
         * long getTotalSpace()
         * 通过此抽象路径名返回分区 named的大小。
         * long getUsableSpace()
         * 返回上的分区提供给该虚拟机的字节数 named此抽象路径名。
         * int hashCode()
         * 计算此抽象路径名的哈希码。
         * boolean isAbsolute()
         * 测试这个抽象路径名是否是绝对的。
         * boolean isDirectory()
         * 测试此抽象路径名表示的文件是否为目录。
         * boolean isFile()
         * 测试此抽象路径名表示的文件是否为普通文件。
         * boolean isHidden()
         * 测试此抽象路径名命名的文件是否为隐藏文件。
         * long lastModified()
         * 返回此抽象路径名表示的文件上次修改的时间。
         * long length()
         * 返回由此抽象路径名表示的文件的长度。
         * String[] list()
         * 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
         * String[] list(FilenameFilter filter)
         * 返回一个字符串数组，命名由此抽象路径名表示的目录中满足指定过滤器的文件和目录。
         * File[] listFiles()
         * 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
         * File[] listFiles(FileFilter filter)
         * 返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。
         * File[] listFiles(FilenameFilter filter)
         * 返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。
         * static File[] listRoots()
         * 列出可用的文件系统根。
         * boolean mkdir()
         * 创建由此抽象路径名命名的目录。
         * boolean mkdirs()
         * 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
         * boolean renameTo(File dest)
         * 重命名由此抽象路径名表示的文件。
         * boolean setExecutable(boolean executable)
         * 为此抽象路径名设置所有者的执行权限的便利方法。
         * boolean setExecutable(boolean executable, boolean ownerOnly)
         * 设置该抽象路径名的所有者或每个人的执行权限。
         * boolean setLastModified(long time)
         * 设置由此抽象路径名命名的文件或目录的最后修改时间。
         * boolean setReadable(boolean readable)
         * 一种方便的方法来设置所有者对此抽象路径名的读取权限。
         * boolean setReadable(boolean readable, boolean ownerOnly)
         * 设置此抽象路径名的所有者或每个人的读取权限。
         * boolean setReadOnly()
         * 标记由此抽象路径名命名的文件或目录，以便只允许读取操作。
         * boolean setWritable(boolean writable)
         * 一种方便的方法来设置所有者对此抽象路径名的写入权限。
         * boolean setWritable(boolean writable, boolean ownerOnly)
         * 设置此抽象路径名的所有者或每个人的写入权限。
         * Path toPath()
         * 返回从此抽象路径构造的java.nio.file.Path对象。
         * String toString()
         * 返回此抽象路径名的路径名字符串。
         * URI toURI()
         * 构造一个表示此抽象路径名的 file: URI。
         * URL toURL()
         * 已弃用
         * 此方法不会自动转义URL中非法的字符。 建议在新的代码转换的抽象路径到URL通过先转换成URI，经由toURI方法，然后经由转换URI为URL URI.toURL方法。
         *
         */
        /**
         * 构造器
         * File(File parent, String child)
         * 从父抽象路径名和子路径名字符串创建新的 File实例。
         *
         * File(String pathname)
         * 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
         *
         * File(String parent, String child)
         * 从父路径名字符串和子路径名字符串创建新的 File实例。
         *
         * File(URI uri)
         * 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
         *
         */
        File file1=new File("");
        System.out.println(file1.canRead());

    }
}
