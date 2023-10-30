```bash
Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git clone https://github.com/JaceyStew6/CDA_M2i.git
Cloning into 'CDA_M2i'...
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (4/4), done.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        CDA_M2i/

nothing added to commit but untracked files present (use "git add" to track)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git add .
warning: adding embedded git repository: CDA_M2i
hint: You've added another git repository inside your current repository.
hint: Clones of the outer repository will not contain the contents of
hint: the embedded repository and will not know how to obtain it.
hint: If you meant to add a submodule, use:
hint:
hint:   git submodule add <url> CDA_M2i
hint:
hint: If you added this path by mistake, you can remove it from the
hint: index with:
hint:
hint:   git rm --cached CDA_M2i
hint:
hint: See "git help submodule" for more information.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   CDA_M2i


Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git commit -m "remot repository"
[main 2b2b8df] remot repository
 1 file changed, 1 insertion(+)
 create mode 160000 CDA_M2i

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ ls
CDA_M2i/  fichier1.txt  fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ ls
CDA_M2i/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ cd CDA_M2i/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ ls
LICENSE  README.md  fichier1.txt  fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore
        fichier1.txt

nothing added to commit but untracked files present (use "git add" to track)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git add .

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git commit -m "repo distant"
[main b4cb3bc] repo distant
 2 files changed, 1 insertion(+)
 create mode 100644 .gitignore
 create mode 100644 fichier1.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git push origin main
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 380 bytes | 380.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/JaceyStew6/CDA_M2i.git
   80e168e..b4cb3bc  main -> main
```