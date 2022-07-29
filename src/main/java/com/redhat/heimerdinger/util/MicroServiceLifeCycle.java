package com.redhat.heimerdinger.util;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;

@ApplicationScoped
class MicroServiceLifeCycle {

  private static final Logger LOGGER = Logger.getLogger(MicroServiceLifeCycle.class);
  
  void onStart(@Observes StartupEvent ev) {
    LOGGER.info("");


  
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::....::::::::::...::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::^^^~~~~~~!!!!~~~^^:::.::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::................::::::::::^~!!!!!!!!!7??7!!!!!!!!!!~^::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::..::::::^^^^^^^~~~~~^^^^::::::..::^~!!!!7!!!!!7JY?!!!!!!!!!!!!~::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.:::^^~!!777777?JJYYYYYYYJJJ??7!!~^^::.^!7!777!!!!!!?5?!!!!!!!!!!!!!^::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.:::^~!!7777!~~^:::^~7JY??YYYYYYYYYYYJJ?7!~!7777777!!!!!!JJ!!!!!!!!!!!!!!^:::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::^~!!!!~~^^::....:::..^7Y?!7?YYYYYJJYYYYYYJ7!77777777!!!!!?J!!!!!!!!!!!!!!~:.:::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::^^.....::~!!~~~^~!~^^^^::::::::::!Y?!!!JYYYY??YYYYYYJ7777777777!!!!!?7!!!!!!!!!!!!!77~^::...::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::.::^^~!7!!!!!~~!!!!!!!^^^~^^^^::::::::::?Y?!!!?YYYJ77YYYYJ?777777!!!77!!!!7?7!!!!!!!!!!!!7JYYYJ?7~^:..:::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::^~!?JYYYYYYJ777777!!!~^^^^^^^::::::::::~YY7!!!JYYY7!7JYY?7!77!!!!!7777!!!!?7!!!!!!!!!!!!!?YYYYYYYYYJ!^..::::::::::::.::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::^^~7JYYYYYYY?77JYYYYY?!~^^^^^^::::^^:::::~JY?!!!7YYY?!!7JJ7!!!!!!!!!77777!!!??!!!!!!!!!!!!!?YYYYYYYYYY55Y7^:::::::::::^~:..:::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::^~~!JYYYYYYY???JYYYYYYJ!^^^^^^^::::^!^.::~!?YJ7!!7JYY?!!!77!!!!!!!!!7??7777!!?J7!!!!!!!!!!!!?YYYYYYYYYYYYY5PJ!:::::::::::?J!^.::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::^~~^^7YYYYYYYJ??YYYYYYJ7!~^^^^^~^::::~!~:^~!!?YJ7!!7JYJ7!!!~^~!!!!!!!7?J?7777!!JY7!!!77!!!!!!7?YYYYYYYYYYYYYYY5PY?^::::::::.7YY57:.::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::^~^^^^!YYYYYYJ??YYYYYJ7~::^^^^^^~^:.:^!!!~!!!!?Y?!!!7JY?!~^^:^~!!!!!!7?YY?7777!7YY7!!7??7!!!!!7JYYYYYYYYYYYYYYYY5PPY?~:.::::.:7YYPB?:.:::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::^^~^^^^:~JYYYYY?7JYYYJ7~:.::^^::^^~^::^~!!!!!!!!?J7!!!!7!^:::^~!!!!!!7?JYYJ77777!?5Y7!!7YY77!!!7?YYYYYYYYYYYYYYYYYYYPP5YJ!^:..:^7YYYPBBJ::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::^^^:^^^^::?YYYYY?7JYY?~:..::^^::::~~^::~!!!!!!!!7??!!!~^^:^^~!!!!!!77?JYYYY?7777!7JPJ!!!?5P?77!!7JYYYYYYYYYYYYYYYYYYYYPP5YY55Y???JYYYY5BBG7:::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::^~~::^^^^::!YYYYJ7!?J7~:.::::^::.:^~~:^~!7!!!!!!!~~~~^^~~~!!!!!!!77?JYYYYYYJ?77777?55?!!?YPGY77!7JYYYYYYYYYYYYYYYYYYYYY5PP5YY5PPPP5YYYYY5GBB5!::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::~!!^:^^^^:::?YYYJ7!!!~:::::::::.:^~!~~!!!!~~~^^^^^~~~!!!!!!!!!77?JYYYYYYYYY?7777!7YP5Y??YPGPY777JYYYYYYYYYYYYYYYYYYYYYYYPPP5YY5PPP5YYYYYY5GBBG?^:::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::^!!!^::^^^::.~YYYJ!^~!~::::::::::^~!!~~^^^^^^^^~~~!!!!!!!!!77??JYYYYYYYYYYJ?7777!7YPGPPPPPGGPJ777?YYYYYYJJJJJJJYYYYYYYYYYPPPP5Y5PP5YYYYYYYY5GGGBJ!:::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::~!~!!::^^^::::7YY?^:^!^:.:::::::^~~^::^^~~^^^^~~~!!!!!!!7??JYYYYYYYYYYYYJJ?777!!7JPGGPPGGGP5J77777JYJJ???JJJJJJY5PPP55YY5PPPP5Y5PP5YYYYYYYYYY5YGBY!^::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::^!!^^!~::^^:::::?Y?::^!^:::::::^^::::^~!~^:::^~!!!!!!77?JYYYYJJ???777777!!!!7?JJJYPGGGPPPP5J77777777???J55YJJ?JPGGGGGPPPPPPPPP5Y5P5YYYYYYYYYYYYY5GBY!^::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::^!!^::~^:^^::::.^Y?::~!~::^!^^^::::~!!~^:::^~!!!!!77?JYYJ?77!!~!!!!!!!!!!!!~!!!?Y5PPPP55YYJ7777777!!77Y5Y7~^:::~?55PGGGGGPPPPP5Y5P5YYYYYYYYYYYYYYPBGY!^::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::~!~:::::::::::::!7:^!!!::~!~::::^!!!~:::^!!77!!7?JYYJ?7!!!!!!!!!!!!!!!!!!!!!!!!!!?YYYYYYJ77777777!!!JGY!::::::::::^!7YPGGGPPPP55P5YYYYYYYYYYYYYYYGBPJ!:::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::^!!^:::::::::::::~^^!!!!~~^:.::~!!!^:::~!77777?JYYYJ7!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?YYYY?77777777!!!YBJ^:^^^:::::::::^~?GGGPPPPPP5YYYYYYYYYYYYYYYPBB57^:::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::!!!::::::::^~!!!!7?JJ?7!~:.::~!7!~::^~!77?7?JYYYY?7!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!YYYJ77777777777?BY^^^^^^:::::::::^~JGGG5PPPPP5YYYYYYYYYYYYYY5GBPJ~::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::^!!!:::::::^~!!!!!!7?YYY!:.:~!!!~:.:~!7????JYYYY?7!!!!!!!!!77??JJJ?!!!!!!!!!!!!!~!7?!JYYJ77777777???PB5~^^~~~~^^:::::^^!YPGG55PPPPPYYYYYYYYYYYYY5GBGY!:.:::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::~!!!!!::::^~!!~~^^^~!77?YY~:^!!!!^::^!!????JYYYYJ7!!!!!!!!7?JYYYYYYJ?!!!!!!!!!!!!^^!??!JYYJ77777777J??PBGY!~~~~~~~~~~~~~~~!5GGYY5PPPP5YYYYYYYYYYY5GBG5!::::...:::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::~!!!!~^::^~~^::..:::::~?JYJ^~!!!!^.:~!7J??JYYYYYJ7!!!!!!7?JYYYYYYJ?77!!~~!!!!!!!!^:!?Y?!YYYJ777777?JYJ?YBBGGY?!!~~~~~~~!!?YPGB5?J?JJY55YYYYYYYYYY5GBG5YYYYJ?!~^:::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::^!!~~^:.:^^::::::^^!77!~~JY?!!!!!:.:!!?J??YYYJJYJ!!!!!!!7JYYYJJ??77!!~^^~!7!~~~!^::~JYY7?YYY?77777JYY5Y??5BPPGGGP5YYYYY5PGGBBG5?Y????J55YYYYYYYYY5GBG5PGBBBGP5YJ7~:::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::^!~:::::::..::^^^^^^~!???JY?!!!!^.:!!?J7?YJ??7JJ7!!!!!!!7?7777!!!!~~^^~!!!~^^~^:.:!JYY??YYYJ777?JYY5555Y??5BGPPGBBBBBBBBBBGGPYJJ?????Y5YYYYYYYYYPBBP5PGGBG55PGGBG5!::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::~~::::::.:^~!!!777777!!!?YY7!!!^.:!7JJ77?7!77JY7!!!!!!!!!!!~~^^::::^~!~^:::^^::.:!YYY?JYYYY?7?JYY5YYY555YJYPGGGP55PPPPPP55YYYYJ???77Y55YYYYYYY5GBGPY55PGP5PBBBBBBBY!:::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::^:::::::^!7!!!!!!!!77?J?7?Y7!!~::~7JJ7!!!!77??7!77?77!~~^:::..:::^~^^:::::::::::!YYYJJYYYYYJYYYYYYY555555YYPPPGGGGP555555PPPPP5J???Y5YYYYYYY5PBBG5YYY5PPGBBBBBBBBG5?:::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::^~!7?JJJJJJ?7!!!7YYJJ7!!:.^!?J7!!!!!77!7?JJ?!~^::..:::::::::::^^::::::.:~7YYYYYYYYYYYYYYYYYY55555YJ?PBGPPPPPPPGGGPPPPPPPPYY555YYYYYY5PGBG5YYYYY5GBBBBBBBBBG5Y?:::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::^!7?JYYYYYYYYYY?!!!7YYY7!~::~?Y?!!!!!!!?JYJ7~^:...:^^^^::::::^^^::.::::.:7JYYYYYYYYYYYYYYYYYY55555Y?JPGB##BBGPPPPPPPPPPP55555YYYYYYY5PBBGPYYYYY5PBBBBBBBBBBG5YY!:::::::::::::");
    LOGGER.info(" :::::::::::.:::::::::::::^!!?YYYYYYYYYYYYYY?!!!?YY7!!^^!JJ!!!!!!7JYJ7~::..:~!~^:::::::^^^::.::^^:.^JYYYYYYYYY55YYYYYYY55555Y?7YPPPPGB##G5555555555YYYYYYYYYYYYY5GP5YYYYYYPGBBBBBBBBBBG5YY?::::::::::::::");
    LOGGER.info(" :::::::::::^:..::::::::::!7JYYJ??????JYYYYYJ!!!!?Y?!!!~?Y7!!!!!?YY7!~:..:~?7^:.:::::::::..:^!~:.:!Y55YY??Y55YJYY5YYYY55555J??Y55PPGB#BP5555YYYYYYYYYYYYYYYYYYYYYYYYYYYY5GBBBBBBBBBBBG55Y?:.:::::::::::::");
    LOGGER.info(" :::::::::::!!!^:..::::::!!7?7!!!!!!!!!7YYYYY7!!!7?!^!!7J7~^^~!?5J7!~:.:!JJ~..::.::~!^::.:~!~:.:~J55J!?Y!.~J5Y!7JYYY55555Y??JPPPPPGBBP55555YYYYYYYYYYYYYYYYYYYYYYYYYYYYYPBBBBBBBBBBBGP5J!:.::::::::::::::");
    LOGGER.info(" ::::::::::.~77?7~^:::.^!!!!!!!!!!!!!!!!?YYYY?!!~^::^!!~^^:~J7^7J7!~::~J5?::^:.:^~??~:.:~?!^..^?55J!^:7J^.:~JY^~JJJY55YYYJJYP##BGGBG5Y555YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYPGGGBBBBBBGPY7^.::::::::::::::::");
    LOGGER.info(" ::::::::::::?J777!!!!!!!!!!!!!!!!!!!!!!7YYYY?~^::^^:::^^::~J!.:^~!^~?Y5YJ77~:~!?Y?^.:~??~::^?Y5?~^77^7!..^^~7:^?JJJYYYYYY5PGGGGB#P5Y555YYYYYYYYYYYYYJ??7777777777777!~~~~~!!77??JJJ?!^^:::::::::::::::::");
    LOGGER.info(" :::::::::::.~J?7!~^~!7!!!!!!!!!!!!!!!!!7YYY?^.:^~^.  ^~^:::^:::::^!J55555YY!7JY5J~^~?Y!:::^JY7^:!Y?^^^:.:~^^^::?JJJJYJ?JYY5PGBBBBGP5PPPPPGGGGBBGGGP5YJJYYYYYYYYYYJJ????JYJY555555PPPPY7^::::::::::::::::");
    LOGGER.info(" :::::::::::::??7!~^~!!!!!!!!!!!!!!!!!!~!JJ~..:^^:   .:^^^^^^.::::^~J555555YY5555Y??YY~:~~^^~:.:!Y7^:::..~!~^^:^?JJYJJJ77YPBBGPBBGGGGGGBBBBBBBGGGGP5555555YYYJJYY5PPPPGGPPPGBBGPPGGPJ!^:.::::::::::::::::");
    LOGGER.info(" ::::::::::::.^J77J!~!!!!!!!!!!7777777!:^!:  .:^:    ..:^7?7~^^::^^^~J55555555555Y!~YY?J!^:. .^!YJ77!~^^7J77!!^7J?JYJJJ7^J5BBGGGBBBGBBBGGBGP555PGGP5YYYYYYY5PPGGGGGGPY5YYY5GGP55PPPJ:..::::::::::::::::::");
    LOGGER.info(" ::::::::::::::7J!JPY?!!!!!!!!?????JJJ!..     :?7:^~!7777?JJJJJJ7!~^^~J555555Y?77^^~?5Y7~. .:^!J5YYYYJ?JYYYYY5JYJJY5J?J?7YJ5BBBBBGGBBBBBBGBBGGGGP5YYY55PGGGGGGGGGGGPYYYY5PGP5Y5PPPGGJ^.::::::::::::::::::");
    LOGGER.info(" :::::::::::::.^J775P5?!!!!!!??77JJYYY~     ^~~?JJ5PGGGGGP5JJY5GGPY?!~!Y55YJ!~::::^77JJJ~.~~~!?J?????????J5PPPP55Y55YJJJY55YPBBBBBBBBBBBBBGGPYJJJ5PGBBBBBBBGPPGGGPYJYY5PGP5YY5PPGGGGGY^.:::::::::::::::::");
    LOGGER.info(" :::::::::::::::7?!?5PY7!!!!7J!7J7JYJJ~   .~??YPGBG5YJ??JPBBBGPPPGBPYJ~JY?~^^^::::^?Y7JJ?JJ????JY555Y555PGGGPPPPPPP5YYYYJY555PPP5555555P5YJJ5GP5J5#BBBBBBBBBPPGP5YYYYY5P5YY5PPGGGGGGGGY^.::::::::::::::::");
    LOGGER.info(" ::::::::::::::.^?7!JPPJ!!!!?J77?7JJ^!~.  ^7JPBPJ!^:::::~?PGBBBGPPGBGJ^!~:^:^^:::^~J555Y??77J5P5J7!~~~?5GGGGGGGPPPPPPBGP5Y5P5JJYY5PPPP5YJY5PB##BP5BBBBBBBBGPPP5YYYYYYYYYY5PPGGGGGGGGGGGJ:.:::::::::::::::");
    LOGGER.info(" ::::::::::::::::!?!!JP5?!!!7Y?!~^!?~.^:.^7PBP?^::::::::~JGGGGBBGPPG#Y^:^^::^:.::^!Y55?777JPP?~::::::^!7?JY5GGGGGPPPPPGBB#BBBGPGGGP5YJY5PPGPGGBBBBBBBBBBBGGP5YYYYYYYYJY5PPGGGGGGGGGGGGGP!.:::::::::::::::");
    LOGGER.info(" :::::::::::::::::7!!75P57!!7JY?^.:~^:^~!JGBY~:^^:::::::::?PGGGBBPPPBB?^^^.::...:~?5Y7!!7PG?^:::^:::::::::^~7YGGGGGPPPPGBGGBBBGP5YJY5PPGGGBBBBBBBBBGGBBGGGPYYYYYJJYYJYPGGGGGGGGGGGGGGGGGJ::::::::::::::::");
    LOGGER.info(" :::::::::::::::::^!!!?5PY7!!7YYJ^:~!!?JJPBP~^:::::::::::::YGGGGBGPPG#P~^:.:::..^7Y5?7!7BG!::^^^:::::::::::^~~JGGGPPPPPPGBGGBBBYJYPGGGBB###BBBGP5Y?J5GGGP5YYYYJ?JYJJYPBBBBBBBBBBBBBBBGGGY::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::~J?!?5PY7!!7Y5Y!~Y55J5BB5~^~~^:::::::::~YGGGGBGPPG#B7^:.^:..^!Y5Y777GB7^^^^^^::::::::::::~~JGGGP5PPPPPGBGBGBBGGBBBBGP5YYJ??7!!7YPGGP5YYYYYJ?JYJ?YGBBBBBBBBBBBBBBBBBGGJ::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::^75Y?J5P5?!^~?JJ?J5YJGBGP7~~~~~^::::::^JGGGG5GPPPG#BJ^::^:.:!Y55Y?7YBB7^^^^^~~^^:::::::::~?PGGGGY5PPPPPBBGGGBBBBPPY?!!!!!!!!!?5GP5YYYYYYJ?JYYJ?YGBBBBBBBBBBBBBBBBBBBP~.:::::::::::::::");
    LOGGER.info(" :::::::::::::::::::!?5P55PPPJ^:^~7Y5PYJGGGGP7~~~~~~~^^~~~7PGG55GPPPB#GJ^:^^:^7Y555J??PBB5!^~~~~~~~~~^^^^^~~~~!5GGGJYPPPPPB#BBGGBGPPY7!!77!!!!!7J?7JYYYYYJ??JYY??PBBBBBBBBBGGGGGGGBBBBG7.::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::~?J5PPPPPY!^^^^!J5YJGGPGGGY7!~~~~~~~~!?PG5YGGPPG#B5?^:^^~?55555Y??5BBGPJ!~~~~~~~~~~~~~~~~!JPGG5JYY5P55BBGGGBGP5?77???7!!!!!!~^7GPYYJJJJYYY?JGBGGGGGGGGGGGGGGGGGGGGGJ:.:::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::~JY5PPPP57~~^^^~7YJPB5GGGBGP5YJJJJY5GBG5Y5Y55PB#PY7^^~7Y555555Y??JGBGGBG5J7!!~~~~~~!!7J5GGGBP?Y?????5#BGGBBP5JJYJ7!!!77!!!~~!PBPJJYYYYYJJYGGGGGGGGGGGGGGGGGGGGGGGGP~.:::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::.:!JY5PPP577J?!^^7YPBG5PGBGBBBBBBBBBG5JYY???YB#BPP5J?JYPPPPP555Y??YGBPPGBBGGP555555PGGBBGGG5?YJ?????G#BBBPPP5J?777?JYJ7!~~~!JBGPPGG5YYJJ5GGGGGGGGGGGGGGGGGGGGGGGGGP!.:::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::.:^!J55P57?YYJ7!JPPGG5Y5GGGGGGGGP5YJYJ???YBB5J?77!!!7?JY5PGGGGY??JGBPPPGGBBBBBBBBBBBBBGPYJYJ????75###GPP5YJJJY55P5?!!~~~!7GBBBGPYJJJ5PGGGGGGGGGGGGGGGGGGGGGGGGGGP~.:::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::..:^!7!~^!?JJYYPPPGGP5YYYYYYYY5YYJ?77JG#BY!~^^^^^~~~~~?JJ55PG5?JPGBBG55PPPGGGGGGGP5YYYYJ????775##BGPJ7!!7?JY55J!~~~!!!75GP5YJJJJ5PGGGGGGGGGGGGGGGGGGGGGGGGGGGG?:::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::^^^^!7??JJ5PPPGGGPPPPPPP5???YGBG5YY?77!^:~!7?JJYYYY5Y5GGY5PPPGGGP55YYYYYYYY55PP5YJ??7?P#BPP5YJJJY55PPY7~~!7JJ7!?55YYYY5PGGGGGGGGGGGGGGGGGGGGGGGGGGGGGP?:.::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::..~!!~~~!J5PPPPPPPPPPPP55PG5J7777??JJ?^:^?5P5YJ??7777?YGGPPPPPPGGGGGGGGGGPPPPPPPYJ5G##GPPPPPPPPPPPY7~!?YPPY7!JPPGGGGGGGGGGGGGBBBBBBBBBBBBBBBGGGGGGPY!:.:::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::.. .:!?JJ????Y555Y5PPGGGP5YJ7~^:^^^^~!?JJ?7?JJ?7!!!~~^~~!!7YGBBGPPPPPPPPPPPPPPPPPPGGB##GPPPPPPP55YJ?77J5PGG5?!7YPPPPPGGGBBBBBBBBBBBBBBBBBBBBBBBBBGGGGJ:.:::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::..  ..:!7J55555YYYYY55YYJ7!~~^^::......:~?JJJ7!~~~~~~~^^::^~!!7J5GBBBGGGGGGGGGGGGBB###BGPPPPPP5JJ5JJY5PGGGPY?!!!??JJJYPBBBBBBBBBBBBBBBBBBBBBBBBBBBBBGGG?.::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::. .. ...~!!7777???????77!!~^:.........:^~!?JJ?!~^.....::^~~^^^~!777?Y5PGBB#######BBBGPPPPPPGGPY7?5PGGGGP5Y?7!!7?JJYJYPGBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBGGP!.::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::. ..  ....^!!!!!!!!!!!!~^::........  ....::~JJJ??7!^..   ..:^^~^~!77777777?Y55PPPPPPPPPPPPP5YJ77?55YPG5YJJ??JY555YJYPGBBBBBBBGGGGGGGGGGGGGGGGGPGBBBBBBGG5^.::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::.....  ......:^~~~~~^^::.........  ....:~!!7J?777!!77!~:........:~!7777777777777?JJYYYYYYJJ?7777J55Y?5GGGGPP555YYJYPGBBBGGGGGGGGGGGGGGGGGGGGGGG577JPBBBGP!.:::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::. ...:.  .....  ..............  ....:^!!!!7?J7!!!!!!!!7!~:...:^:..^77777777777777777777777777?J555Y775PP555555YJY5GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGJ..^7PBG?:::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::.....^~:     ............... .....:^~^^:^^7J?!!!!!!!!!!!7!^...:^~~^^~777777777777777777777?JY555Y?7!?YYY5PP5YYJ5GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG?.:..^YJ:.::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::.....^!~:..    ..............:::::..:!?YY5YJJ??7!!!!!!!!!!~^:...^!77777777777777777???JY5555YYJ??7?Y5PGP55YY5PGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGP7:::::.::.:::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::.....:^!!~^^:::.....:::::::::...:~?Y55555555P55Y?7!!!!!!!!~^^^::^!?Y5555YYYYYYYYY5555555YYYJJYJ?J5GGGP55Y5GGGGGGGGGGGGGGGGGGBBBGGGGGGGGGGGGP!..:::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::.......:^~~~!~~~~~~~^^::....:~7J55555555PP555555Y?7!!!!!!!^::^^~~~~!?YY5555555555555555YYYYY??5GGGGP555PGGGGGGGGGGGGGGGGGGPJJPBBGGGGGGGGGP!::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::.^~^:..................:^!?Y555555555PGGGP5555555YJ7!!!!!!!^:..:^^~7??JJJJJJYYYYYYYYYYYJJ???5GGGGP5555PGGGGGGGGGGGGGGGGGGG7.^?PBGGGGGGGY~.::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::^77!~^::........::^~7?Y555555555555PGGPYGGP55555555Y?77!!!!!~^:....^~!777777???JJYYYJYYJJ?YGGGGGPP5PGGGGGGGGGGGGGGBGGGGGG7...~PBGGGG57:.:::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::~7777!!!~~!77?JYY55555555555555PPGGPJ~:?GGGP555555555YJ?7!!777!~^^^^~!77?JJJYYYYYY555YJJ5GGGGGPPPGGGGGGGGGGGGGGJ^?GGGGGJ:.::.!GBG5?^..::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::.:^!7?????JJY555555555555555PPGGG5?~:..:?PGGGPP55555555555YYYYYYYJJJJJJJJJYY55555YYYYJYPGGGGGGGGGGGGGGGGGGGGGGG7..7GBP?:.:::.^5Y!:..::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::..::^~!7??Y5555PPP555PPPGGGPY?~:..:::..~YGGGGGPP555555555555555555555555555555YY555GGGGGGBBBBBBBGGGGGGGGGGGGJ:..^J7^..::::::^:..::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::.....^!JYYYY55555YYJJ?!~^:...:::::::.:!YPGGGGGPPP555555555555555555555555YYYPGGGGBGGGPYJYY55PGGGBBBGGGGGY^.::::..::::::::.:::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::^^^^^::::......::::::::::::..:~7YPGGGGGGGPPPP5555555555555YYYYJJYPGGGGG5PGGGJ:.:::^^!7?Y5GGBGGP~.::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::........:::::::::::::::::::::::..:^!7JY5PPPPP55YJJJJJJJJ???77!~^:JGGGGGP~^!JPGY^.:......::~!J5GGJ:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::....::^^~~~~~~~~~~~~~~^^^:::...:?GGGG5:...^7Y?:.:::::::....:~7J~.:::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::...................:::::::.:!5GGJ::::..:^^::::::::::::...::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.^?57:::::::.::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::..^^::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::..::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    LOGGER.info(" ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    LOGGER.infof("The Heimerdinger API is starting with profile: %s", ProfileManager.getActiveProfile());
    LOGGER.info("");
  }

  void onStop(@Observes ShutdownEvent ev) {
      LOGGER.info("The Order API is stopping   ");
  }
}

