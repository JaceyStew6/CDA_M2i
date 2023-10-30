```pl
Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ touch .gitignore

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ ls -la
total 9
drwxr-xr-x 1 Administrateur 197121 0 Oct 30 14:23 ./
drwxr-xr-x 1 Administrateur 197121 0 Oct 30 11:23 ../
drwxr-xr-x 1 Administrateur 197121 0 Oct 30 12:54 .git/
-rw-r--r-- 1 Administrateur 197121 0 Oct 30 14:23 .gitignore
-rw-r--r-- 1 Administrateur 197121 0 Oct 30 12:53 fichier1.txt
-rw-r--r-- 1 Administrateur 197121 5 Oct 30 12:53 fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

nothing added to commit but untracked files present (use "git add" to track)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git add .gitignore

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git commit .gitignore
```