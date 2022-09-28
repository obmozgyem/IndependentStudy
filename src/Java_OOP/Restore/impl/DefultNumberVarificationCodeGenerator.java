package Java_OOP.Restore.impl;

import Java_OOP.Restore.VarificationCodeGenerator;

import java.util.Random;

public final class DefultNumberVarificationCodeGenerator implements VarificationCodeGenerator {
    private final Random random = new Random();


    private final int length;

    public DefultNumberVarificationCodeGenerator(int length) {
        this.length = length;
    }

    public DefultNumberVarificationCodeGenerator() {
        this(20);
    }

    @Override
    public String generate() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            stringBuilder.append(random.nextInt(10));
        }

        return stringBuilder.toString();
    }
}
