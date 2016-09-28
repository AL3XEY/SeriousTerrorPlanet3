	Coeur du gameplay :
	
		- Reflexion : Chaque joueur doit calculer de tête les déplacements de ses pions. Et annoncer quel point il déplace à quel endroit ; s'il fait une erreur, son coup est annulé et on passe à l'autre joueur. 
			Exemple : Jacques a un pion en c1, il fait 3 au dé, s'il annonce c1 -> c4, le coup est validé, s'il annonce c1->c5, son coup est annulé, et c'est à son adversaire de jouer).
		
	- Règles du jeu : 
		- 2 Joueurs
		- Matériel : un plateau de jeu, 3 pions rouges, 3 pions bleus, un D6.
		- Au début de la partie, tous les pions sont dans la case de départ.
		- Les 2 Joueurs jouent tour à tour, le premier est désigné aléatoirement.
		- Le jeu se déroule ensuite avec deux phases : déplacement et bataille
			- la phase de déplacement Le joueur qui a la main, lance le dé pour obtenir des points de déplacement.Le joueur peut déplacer les pions de sa couleur qui ne sont pas dans la zône d'arrivée. Le déplacement peut se faire dans les deux sens (gauche et droite) et les points de déplacement peuvent être répartis sur plusieurs pions. Le joueur doit consommer tous ses points dans la zone de déplacement quitte à changer de direction. A la fin de la phase de déplacement, un joueur peut annoncer une bataille en criant...BATAILLE. . . Si le joueur utilise trop de points de déplacement, ou s'il lui en reste, il a donc fait une erreur de calcul. Son coup est alors annulé, et c'est à son adversaire de jouer.
			- Description de la phase "bataille" Si un joueur déclare bataille à la fin de sa phase de mouvement, une bataille se déclenche alors dans toutes les cases qui contiennent des pions avec des couleurs différentes. Dans chaque case, chaque jeton du joueur va se sacrifier et prendre exactement un jeton de l'adverse pour le ramener à la case de départ. Cette opération recommencera jusqu'à ce que la case ne contienne que des jetons d'une même couleur.
		- Un pion ne peut atteindre la zone d'arrivée que directement. Autrement dit, il faut que le nombre de cases séparant le pion de la case d'arrivée corresponde exactement au nombre de points de déplacements tiré par le dé.
		
	- Contrôles : A son tour de jeu, le joueur est informé du nombre de points de déplacements qui lui est assigné ; Il doit alors annoncer tous ses déplacements à la fois et s'il souhaite faire une bataille ou non, la synaxe étant la suivante : caseDepart->caseArrivee (caseDepart->caseArrivee...) (!) (ex : "0->3 2->4 !" 5 points de déplacement, le pion en case 0 est déplacé en case 3, le pion en case 2 est déplacé en case 4, puis bataille). S'il effectue une erreur de calcul, son coup est annulé, et son adversaire prend la main. Si c'est une erreur de syntaxe, il peut annoncer à nouveau ses déplacements.
	
	- Objectif : Amener ses 3 pions dans la case d'arrivée.
	- Challenge : Ne pas se tromper dans ses calculs, mettre en place une stratégie, compétition contre un adversaire.
	- Recompense : 
	- Moyens :
	
	- Feedback : Lorsqu'un joueur entre ses commandes de déplacement, si sa commande est valide, elle est effectuée, on met donc à jour le plateau. S'il y a une erreur de syntaxe, on lui indique et il peut la resaisir. S'il y a une erreur de calcul, on lui indique et on passe à l'autre joueur.
	
	- Camera : Vue console, rendu en caractères.
	
	- Menu : Au lancement de l'application, la partie est directement lancée.
	
	
	
	
	
	
