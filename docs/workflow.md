# 练习流程

1. 先读题目和测试，确认输入、输出、异常和边界条件。
2. 不看答案，自己手写思路，包括核心循环、递归关系或数据结构状态变化。
3. 写出时间复杂度和空间复杂度。
4. 实现代码，只改 `src/main/java` 中对应练习类。
5. 运行单个测试，例如：

```powershell
.\gradlew.bat test --tests sorting.InsertionSortTest
```

6. 根据失败信息修正错误，不急着一次改很多题。
7. 把错因记录到 `docs/wrong_cases.md`。
8. 对照 `docs/checklist.md` 更新掌握情况。
9. 最后闭卷重写核心代码，确认自己离开 IDE 提示也能写出来。
