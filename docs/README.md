# algorithm-practice-java

这是一个面向东京科学大学情报工学系修士笔试 C 组的 Java 算法训练工程。它不是用来刷 LeetCode 数量的，而是用来训练笔试需要的手写算法能力：读懂题、说清复杂度、手动推样例、写出稳定代码。

## 环境

- Java 17
- Gradle Wrapper
- JUnit 5

不需要预先安装 Gradle。Windows 下在工程目录运行：

```powershell
.\gradlew.bat test
```

macOS / Linux 下运行：

```bash
./gradlew test
```

## 用 IntelliJ IDEA 打开

1. 打开 IntelliJ IDEA。
2. 选择 `Open`。
3. 选择 `E:\projects_codex\aim_tokyo_science\algorithm-practice-java`。
4. 等待 Gradle 同步完成。
5. 在 `src/test/java` 中右键测试类或包，选择 `Run Tests`。

## 练习方式

每个 `src/main/java` 下的类只提供题目说明、输入输出约定、方法签名和 TODO。算法实现需要你自己完成。

每个 `src/test/java` 下的测试类已经写好。刚开始测试失败是正常的，因为主代码还没有实现。你实现正确后，对应测试应当通过。

每个算法的完成标准：

- 能说出用途
- 能写出复杂度
- 能手动跑样例
- 能通过测试
- 能闭卷重写核心代码

## 新增练习题

1. 在合适的包下新增主类，例如 `src/main/java/graph/DijkstraBasic.java`。
2. 在 JavaDoc 中写清楚题目目标、输入输出说明和方法签名。
3. 方法体只先写 TODO 或 `throw new UnsupportedOperationException("TODO: implement by yourself");`。
4. 在 `src/test/java` 的同名包下新增测试类。
5. 测试覆盖普通样例、边界样例、空输入或单元素、重复元素、异常情况。
6. 先让测试失败，再逐步实现主代码直到测试通过。
