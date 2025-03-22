import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入模块名(例如:day08): ");
        String moduleName = scanner.nextLine();

        // 使用相对路径，因为这个程序应该在项目内运行
        String basePath = moduleName + "/src";
        String packageBase = basePath + "/com/Demo";

        try {
            // 创建基础目录
            Files.createDirectories(Paths.get(packageBase));

            // 查找当前最大的 demo 编号
            int maxDemoNumber = findMaxDemoNumber(packageBase);

            // 新的 demo 编号
            int newDemoNumber = maxDemoNumber + 1;

            // 创建新的 demo 包
            String demoPackagePath = packageBase + "/demo" + newDemoNumber;
            Files.createDirectories(Paths.get(demoPackagePath));

            // 创建 Test.java 文件
            String testJavaContent =
                    "package com.Demo.demo" + newDemoNumber + ";\n\n" +
                            "public class Test {\n" +
                            "    public static void main(String[] args) {\n" +
                            "        // 请在这里编写代码\n" +
                            "    }\n" +
                            "}\n";

            Files.write(Paths.get(demoPackagePath, "Test.java"), testJavaContent.getBytes());

            System.out.println("已在 " + moduleName + " 模块中创建 demo" + newDemoNumber + " 包！");

        } catch (IOException e) {
            System.err.println("创建包时出错: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();
    }

    // 查找当前最大的 demo 编号
    private static int findMaxDemoNumber(String packageBase) {
        int maxNumber = 0;
        File baseDir = new File(packageBase);

        if (baseDir.exists() && baseDir.isDirectory()) {
            File[] files = baseDir.listFiles();
            if (files != null) {
                Pattern pattern = Pattern.compile("demo(\\d+)");

                for (File file : files) {
                    if (file.isDirectory()) {
                        Matcher matcher = pattern.matcher(file.getName());
                        if (matcher.matches()) {
                            try {
                                int number = Integer.parseInt(matcher.group(1));
                                if (number > maxNumber) {
                                    maxNumber = number;
                                }
                            } catch (NumberFormatException e) {
                                // 忽略无法解析的目录名
                            }
                        }
                    }
                }
            }
        }

        return maxNumber;
    }
}
