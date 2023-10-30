```pl
Administrateur@Salle_5_A4 MINGW64 ~/Documents
$ mkdir exo2Git

Administrateur@Salle_5_A4 MINGW64 ~/Documents
$ cd exo2Git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git
$ ls

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git
$ git init
Initialized empty Git repository in C:/Users/Administrateur/Documents/exo2Git/.git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ touch fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ ls
fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git add .

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   fichier1.txt


Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git commit -m "First commit"
[main (root-commit) 62b218f] First commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git log
commit 62b218f17db31a90ae9ccbbe7b4f0ad4e518e58d (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:26:13 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ touch fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        fichier2.txt

nothing added to commit but untracked files present (use "git add" to track)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git add fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   fichier2.txt


Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git commit -m "Second commit"
[main 2839f34] Second commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git log
commit 2839f345933b80314ff1f5f67de8c83378d8fd3c (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:27:20 2023 +0100

    Second commit

commit 62b218f17db31a90ae9ccbbe7b4f0ad4e518e58d
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:26:13 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   fichier2.txt

no changes added to commit (use "git add" and/or "git commit -a")

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git commit -am "Third commit"
[main 3867718] Third commit
 1 file changed, 1 insertion(+)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git log
commit 3867718d470f3240f371ce526d6367dfd085361f (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:29:56 2023 +0100

    Third commit

commit 2839f345933b80314ff1f5f67de8c83378d8fd3c
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:27:20 2023 +0100

    Second commit

commit 62b218f17db31a90ae9ccbbe7b4f0ad4e518e58d
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:26:13 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git reset --mixed

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git log
commit 3867718d470f3240f371ce526d6367dfd085361f (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:29:56 2023 +0100

    Third commit

commit 2839f345933b80314ff1f5f67de8c83378d8fd3c
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:27:20 2023 +0100

    Second commit

commit 62b218f17db31a90ae9ccbbe7b4f0ad4e518e58d
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:26:13 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git reset --mixed 3867718

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git log
commit 3867718d470f3240f371ce526d6367dfd085361f (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:29:56 2023 +0100

    Third commit

commit 2839f345933b80314ff1f5f67de8c83378d8fd3c
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:27:20 2023 +0100

    Second commit

commit 62b218f17db31a90ae9ccbbe7b4f0ad4e518e58d
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:26:13 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git reset --mixed 2839f34
Unstaged changes after reset:
M       fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git log
commit 2839f345933b80314ff1f5f67de8c83378d8fd3c (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:27:20 2023 +0100

    Second commit

commit 62b218f17db31a90ae9ccbbe7b4f0ad4e518e58d
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:26:13 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git switch 62b218
fatal: a branch is expected, got commit '62b218'
hint: If you want to detach HEAD at the commit, try again with the --detach option.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git checkout 62b218
error: Your local changes to the following files would be overwritten by checkout:
        fichier2.txt
Please commit your changes or stash them before you switch branches.
Aborting

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   fichier2.txt

no changes added to commit (use "git add" and/or "git commit -a")

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git commit -am "new"
[main 64d624f] new
 1 file changed, 1 insertion(+)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git checkout 62b218
Note: switching to '62b218'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at 62b218f First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git ((62b218f...))
$ git branch firstbranch

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git ((62b218f...))
$ git switch firstbranch
Switched to branch 'firstbranch'

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git status
On branch firstbranch
nothing to commit, working tree clean

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git status
On branch firstbranch
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   fichier1.txt

no changes added to commit (use "git add" and/or "git commit -a")

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git commit -am "First Commit in first branch"
[firstbranch ed53e1f] First Commit in first branch
 1 file changed, 1 insertion(+)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git log
commit ed53e1f6fda5eec284dc9fc5b4b5d4b321cc404b (HEAD -> firstbranch)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 12:26:46 2023 +0100

    First Commit in first branch

commit 62b218f17db31a90ae9ccbbe7b4f0ad4e518e58d
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 11:26:13 2023 +0100

    First commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git branch
* firstbranch
  main

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git tag v0.1 ed53e1f

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git tag
v0.1

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (firstbranch)
$ git switch main
Switched to branch 'main'

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git tag
v0.1

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git branch -D firstbranch
Deleted branch firstbranch (was ed53e1f).

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git branch
* main
```