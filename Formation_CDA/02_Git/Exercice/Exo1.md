```bash
Administrateur@Salle_5_A4 MINGW64 ~
$ cd Documents/

Administrateur@Salle_5_A4 MINGW64 ~/Documents
$ cd exo1Git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git
$ git init
Initialized empty Git repository in C:/Users/Administrateur/Documents/exo1Git/.git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ touch fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ ls
fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git status
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        fichier1.txt

nothing added to commit but untracked files present (use "git add" to track)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git add fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   fichier1.txt


Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git commit -m "First commit"
[main (root-commit) 9074ff3] First commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git log
commit 9074ff31b19741787d28f93b931f4b9c66fefebc (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 09:31:16 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git status
On branch main
nothing to commit, working tree clean

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   fichier1.txt

no changes added to commit (use "git add" and/or "git commit -a")

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git commit -am "Second commit"
[main 338750d] Second commit
 1 file changed, 1 insertion(+)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git log
commit 338750dca83bd65bc45083ee34e4fa7478e9e477 (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 09:32:36 2023 +0100

    Second commit

commit 9074ff31b19741787d28f93b931f4b9c66fefebc
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 09:31:16 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$  git log -n "1"
commit 338750dca83bd65bc45083ee34e4fa7478e9e477 (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 09:32:36 2023 +0100

    Second commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git --oneline
unknown option: --oneline
usage: git [-v | --version] [-h | --help] [-C <path>] [-c <name>=<value>]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           [--config-env=<name>=<envvar>] <command> [<args>]

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git log --oneline
338750d (HEAD -> main) Second commit
9074ff3 First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$  git show 338750d
commit 338750dca83bd65bc45083ee34e4fa7478e9e477 (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 09:32:36 2023 +0100

    Second commit

diff --git a/fichier1.txt b/fichier1.txt
index e69de29..61652fd 100644
--- a/fichier1.txt
+++ b/fichier1.txt
@@ -0,0 +1 @@
+jjjjj
\ No newline at end of file

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo1Git (main)
$ git diff 338750d 9074ff3
diff --git a/fichier1.txt b/fichier1.txt
index 61652fd..e69de29 100644
--- a/fichier1.txt
+++ b/fichier1.txt
@@ -1 +0,0 @@
-jjjjj
\ No newline at end of file


```
