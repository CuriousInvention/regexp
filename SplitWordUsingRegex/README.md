# Regex 
```agsl
String delimiters = "-|\\s+|,";
```
# Input
```agsl
String str = "python language";
String str1 = "python";
String str2 = "python-object";
String str3 = "python,object";
```

# output
```agsl
'python language' is split into :: [python, language]
'python' is split into :: [python]
'python-object' is split into :: [python, object]
'python,object' is split into :: [python, object]
```