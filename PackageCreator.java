import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PackageCreator {
    // 在已存在的模块中创建包和类
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入模块名(例如:day08): ");
        String moduleName = scanner.nextLine();

        System.out.print("请输入题目数量: ");
        int workCount = scanner.nextInt();

        // 使用相对路径，因为这个程序应该在项目内运行
        String basePath = moduleName + "/src";

        try {
            for (int i = 1; i <= workCount; i++) {
                // 创建包结构
                String packagePath = basePath + "/com/home/work" + i;
                Files.createDirectories(Paths.get(packagePath));

                // 创建Main.java文件
                String mainJavaContent =
                        "package com.home.work" + i + ";\n\n" +
                                "public class Test  {\n" +
                                "    public static void main(String[] args) {\n" +
                                "    }\n" +
                                "}\n";

                Files.write(Paths.get(packagePath, "Test.java"), mainJavaContent.getBytes());
            }

            System.out.println("已在" + moduleName + "模块中创建" + workCount + "个工作包！");

        } catch (IOException e) {
            System.err.println("创建包时出错: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();
    }
}