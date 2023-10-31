## Exercice interaction remote (Github)

1. **Transférer tout le contenu du cours en local sur votre repository distant.**

```bash
Administrateur@Salle_5_A4 MINGW64 ~
$ cd Documents/

Administrateur@Salle_5_A4 MINGW64 ~/Documents
$ ls
'Ma musique'@  'Mes images'@  'Mes vidéos'@   TestGit/   desktop.ini   exo1Git/   exo2Git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents
$ cd exo2Git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ git status
On branch main
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
  (commit or discard the untracked or modified content in submodules)
        deleted:    .gitignore
        modified:   CDA_M2i (new commits, modified content, untracked content)
        deleted:    fichier1.txt
        deleted:    fichier2.txt

no changes added to commit (use "git add" and/or "git commit -a")

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git (main)
$ cd CDA_M2i/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ ls
Formation_CDA/  LICENSE  README.md  fichier1.txt  fichier2.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Formation_CDA/02_Git/Cours_GitRemote.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Formation_CDA/02_Git/Exercice/Exercice_remote.md

no changes added to commit (use "git add" and/or "git commit -a")

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git add Formation_CDA/02_Git/Cours_GitRemote.md

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   Formation_CDA/02_Git/Cours_GitRemote.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Formation_CDA/02_Git/Exercice/Exercice_remote.md


Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git commit -m "Ajout partie cours GitHub Remote"
[main ee1da89] Ajout partie cours GitHub Remote
 1 file changed, 7 insertions(+)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git log
commit ee1da8930bfa74e1918cf785fa605e161ffc0c8e (HEAD -> main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Tue Oct 31 09:24:25 2023 +0100

    Ajout partie cours GitHub Remote

commit 4744ea5825632fe88dc94af8cc18e5f0321446ad (origin/main, origin/HEAD)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 16:56:53 2023 +0100

    Ajout cours Markdown, CLI et Git

commit b4cb3bc380942707523b048e0c84209d64b6808a
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 16:26:57 2023 +0100

    repo distant

commit 80e168e861e31658e2717184374e64c8fec2c5e3
Author: JaceyStew6 <112008764+JaceyStew6@users.noreply.github.com>
Date:   Mon Oct 30 15:59:43 2023 +0100

    Initial commit
```


2. **Créer une branche secondaire en remote.**

Création de la branche depuis l'interface graphique de GitHub

```bash
Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git pull New-branch New-Branch
fatal: 'New-branch' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git pull #ou git fetch
From https://github.com/JaceyStew6/CDA_M2i
 * [new branch]      New-branch -> origin/New-branch
Already up to date.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git checkout New-branch #ou git checkout -b New-branch origin/New-branch
Switched to a new branch 'New-branch'
branch 'New-branch' set up to track 'origin/New-branch'.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ git switch main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

#Pour voir toutes les branches disponibles en remote
Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git branch -r
  origin/HEAD -> origin/main
  origin/New-branch
  origin/main
```


3. **Créer un fichier texte à votre nom et vous le pushez dans cette branche secondaire.**

```bash
Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (main)
$ git switch New-branch
Switched to branch 'New-branch'
Your branch is up to date with 'origin/New-branch'.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ touch roxane.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ git status
On branch New-branch
Your branch is up to date with 'origin/New-branch'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Formation_CDA/02_Git/Exercice/Exercice_remote.md
        roxane.txt

nothing added to commit but untracked files present (use "git add" to track)

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ git add roxane.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ git commit -m "ajout fichier roxane.txt"
[New-branch b0c1ff3] ajout fichier roxane.txt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 roxane.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ git log
commit b0c1ff3d50f54698c77fe549529db09ea68fcd0f (HEAD -> New-branch)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Tue Oct 31 09:50:50 2023 +0100

    ajout fichier roxane.txt

commit ee1da8930bfa74e1918cf785fa605e161ffc0c8e (origin/main, origin/New-branch, origin/HEAD, main)
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Tue Oct 31 09:24:25 2023 +0100

    Ajout partie cours GitHub Remote

commit 4744ea5825632fe88dc94af8cc18e5f0321446ad
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 16:56:53 2023 +0100

    Ajout cours Markdown, CLI et Git

commit b4cb3bc380942707523b048e0c84209d64b6808a
Author: Roxane POUCHAIN <r.pouchain.dev@gmail.com>
Date:   Mon Oct 30 16:26:57 2023 +0100

    repo distant

commit 80e168e861e31658e2717184374e64c8fec2c5e3
Author: JaceyStew6 <112008764+JaceyStew6@users.noreply.github.com>
Date:   Mon Oct 30 15:59:43 2023 +0100

    Initial commit

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ git push origin New-branch
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (2/2), 289 bytes | 289.00 KiB/s, done.
Total 2 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/JaceyStew6/CDA_M2i.git
   ee1da89..b0c1ff3  New-branch -> New-branch

```


4. **Vous récupérez le fichier .txt de quelqu'un d'autre de la formation.**


```bash
Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ git clone https://github.com/FaresDr/CDA_M2I_Fares_Dries/blob/Fares/FichierFaresDries.txt #ou git remote add repo_untel url_du_depot pour créer les connexions suivi d'un git fetch repo_untel
Cloning into 'FichierFaresDries.txt'...
fatal: repository 'https://github.com/FaresDr/CDA_M2I_Fares_Dries/blob/Fares/FichierFaresDries.txt/' not found

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ ls
Formation_CDA/  LICENSE  README.md  fichier1.txt  fichier2.txt  roxane.txt

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i (New-branch)
$ cd Formation_CDA/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA (New-branch)
$ ls
01_Introduction/  02_Git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA (New-branch)
$ cd 02_Git/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA/02_Git (New-branch)
$ ls
Cours_Git.md  Cours_GitRemote.md  Exercice/  initialisegitignore.md

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA/02_Git (New-branch)
$ mkdir RepoFares

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA/02_Git (New-branch)
$ cd RepoFares/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA/02_Git/RepoFares (New-branch)
$ git clone --single-branch -b Fares https://github.com/FaresDr/CDA_M2I_Fares_Dries.git #Attention: pas nécessairement recommandé de ne récupérer qu'une branche d'un repo car peut créer des erreurs de temporalité
Cloning into 'CDA_M2I_Fares_Dries'...
remote: Enumerating objects: 25, done.
remote: Counting objects: 100% (25/25), done.
remote: Compressing objects: 100% (18/18), done.
remote: Total 25 (delta 6), reused 17 (delta 1), pack-reused 0
Receiving objects: 100% (25/25), 12.78 KiB | 6.39 MiB/s, done.
Resolving deltas: 100% (6/6), done.

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA/02_Git/RepoFares (New-branch)
$ ls
CDA_M2I_Fares_Dries/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA/02_Git/RepoFares (New-branch)
$ cd CDA_M2I_Fares_Dries/

Administrateur@Salle_5_A4 MINGW64 ~/Documents/exo2Git/CDA_M2i/Formation_CDA/02_Git/RepoFares/CDA_M2I_Fares_Dries (Fares)
$ ls
01_Introduction/  02_Git/  FichierFaresDries.txt  LICENSE  README.md  test_Repo.txt

```