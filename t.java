[1mdiff --git a/.github/workflows/java-ci.yml b/.github/workflows/java-ci.yml[m
[1mindex 30e77fc..f29ae61 100644[m
[1m--- a/.github/workflows/java-ci.yml[m
[1m+++ b/.github/workflows/java-ci.yml[m
[36m@@ -1,14 +1,15 @@[m
[32m+[m
 name: Java CI[m
 [m
 on:[m
   push:[m
[31m-    branches:[m
[31m-      - main[m
 [m
   pull_request:[m
     branches:[m
       - main[m
 [m
[32m+[m[32m  workflow_dispatch:[m
[32m+[m
 jobs:[m
   compile:[m
     runs-on: ubuntu-latest[m
[36m@@ -17,11 +18,16 @@[m [mjobs:[m
       - name: Checkout repository[m
         uses: actions/checkout@v4[m
 [m
[31m-      - name: Set up Java[m
[32m+[m[32m      - name: Set up Java 21[m
         uses: actions/setup-java@v4[m
         with:[m
           distribution: temurin[m
           java-version: '21'[m
 [m
[31m-      - name: Compile Java files[m
[31m-        run: javac *.java[m
\ No newline at end of file[m
[32m+[m[32m      - name: Compile all Java files[m
[32m+[m[32m        run: |[m
[32m+[m[32m          mkdir -p build/classes[m
[32m+[m[32m          find . -type f -name '*.java' -not -path './.git/*' -print0 | xargs -0 -r javac -d build/classes[m
[32m+[m
[32m+[m[32m      - name: Compilation successful[m
[32m+[m[32m        run: echo "Java compilation completed successfully!"[m
