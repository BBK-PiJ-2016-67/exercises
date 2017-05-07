int power(int b, int e) {
  int result = 1

  for (i = 0; i < e; i++) {
    result = result * b
  }

  return result
}

int power2(int e) {
  return power(2, e)
}

int binary2decimal(String binary) {
  int result = 0

  for (i = 0; i < binary.length(); i++) {
    String str = binary.charAt(binary.length() - i - 1)
    int x = Integer.parseInt(str)

    result = result + (x * power2(i))
  }

  return result
}

String decimal2binary(int decimal) {
  int result = 0

  for (i = 0; i < binary.length(); i++) {
    String str = binary.charAt(binary.length() - i - 1)
    int x = Integer.parseInt(str)

    result = result + (x * power2(i))
  }

  return result
}

int result = binary2decimal("100")

print(result)