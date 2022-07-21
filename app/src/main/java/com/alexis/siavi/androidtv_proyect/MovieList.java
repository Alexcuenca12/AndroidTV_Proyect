package com.alexis.siavi.androidtv_proyect;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Accion y Aventura",
            "Accion Pupulares",
            "Comedia",
            "Dramas",
            "Terror",
            "Superheroes"
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Bumbleblee",
                "Avengers: EndGame",
                "Transformers: Last Night",
                "Sonic 2",
                "Tortugas Ninjas: Fuera de las Sombras",
                "Jumper",
                "Mision Rescate",
                "Estación Zombie",
                "La Vieja Guardia",
                "Batman: El Caballero de la Noche",
                "Venom",
                "Fast & Furiuos 5"

        };


        String description[] = {

                "En 1987, la adolescente Charlie encuentra en un depósito de chatarra lo que parece ser un Volkswagen amarillo corriente. " +
                        "Sin embargo, mientras lo restaura, el coche se transforma en Bumblebee," +
                        "un pequeño \"autobot\" que ha sido enviado a la Tierra con el fin de establecer una base para los de su especie.",
                "Después de los eventos devastadores de \"Avengers: Infinity War\", el universo está en ruinas debido a las acciones " +
                        "de Thanos, el Titán Loco. Con la ayuda de los aliados que quedaron, los Vengadores deberán reunirse una vez más para " +
                        "intentar detenerlo y restaurar el orden en el universo de una vez por todas.",
                "La guerra entre los Transformers y los humanos amenaza con destruir la Tierra. Con el gigante Optimus Prime muy lejos, realizando una misión espacial," +
                        " el futuro del planeta depende ahora de la extraña alianza forjada entre el inventor Cade Yeager, Bumblebee, un lord inglés y un profesor de Oxford.",
                "Después de establecerse en Green Hills, Sonic quiere demostrar que tiene madera de héroe. La prueba de fuego llega con el retorno del malvado " +
                        "Robotnik, y su nuevo compinche, Knuckles, en busca de una esmeralda que destruye civilizaciones. " +
                        "Sonic forma equipo con su propio compañero de fatigas, Tails, y juntos se lanzan a una aventura que les llevará " +
                        "por todo el mundo en busca de la preciada piedra para evitar que caiga en manos equivocadas.",
                "Michelangelo, Donatello, Leonardo y Raphael han vuelto para enfrentarse a villanos más grandes y más terribles. " +
                        "Esta vez, contarán con la ayuda de April O'Neil y un nuevo aliado, el enmascarado Casey Jones. El supervillano Shredder, " +
                        "tras escapar de la cárcel, urde un diabólico plan para dominar el mundo con la ayuda de dos estúpidos secuaces: Bebop y Rocksteady. " +
                        "Sin embargo, no cuenta con que nuestras queridas tortugas se prepararán para acabar con sus maléficas intenciones.",
                "David Rice es un joven que tiene el misterioso poder de teletransportarse a cualquier lugar del mundo. Por esta razón, será perseguido por una " +
                        "organización secreta cuya misión es acabar con todos aquellos que posean esta habilidad.",
                "Tyler Rake, un intrépido mercenario, es enviado a Bangladesh por un poderoso mafioso encarcelado para que salve a su hijo secuestrado.",
                "Un brote viral misterioso pone a Corea en estado de emergencia. Sok-woo y su hija Soo-ahn suben al KTX, un tren rápido que une los 442 km que separan Seúl de Busan, una ciudad que se " +
                        "defiende con éxito de la epidemia. Sin embargo, justo en el momento de su partida, la estación es invadida por zombis que matan al conductor del tren y a otros pasajeros.",
                "Un grupo de mercenarios, todos inmortales y con la capacidad de curarse a sí mismos, descubren que alguien sabe su secreto y deben luchar para proteger su libertad.",
                "Con la ayuda del teniente Jim Gordon y del Fiscal del Distrito Harvey Dent, Batman mantiene a raya el crimen organizado en Gotham. Todo cambia cuando aparece el Joker, un nuevo criminal que " +
                        "desencadena el caos y tiene aterrados a los ciudadanos.",
                "El periodista Eddie Brock intenta desenmascarar al genio científico Carlton Drake, el célebre fundador de la Fundación Vida. Mientras investiga uno de los experimentos de Drake, Brock establece una " +
                        "simbiosis con un ente alienígena que le ofrece superpoderes, pero el ser se apodera de su personalidad y lo vuelve perverso.",
                "Los viejos amigos Dominic y Mia Toretto y Brian O'Conner se encuentran ahora en Río de Janeiro, donde pretenden dar un último golpe con el fin de obtener su libertad. Para ello reúnen a un grupo de élite de pilotos experimentados."



        };

        String studio = "Movie Description...";

        String videoUrl[] = {
                "https://rr1---sn-q4fl6nsr.googlevideo.com/videoplayback?expire=1658428477&ei=3EfZYpvuOvL3xN8PybWowAQ&ip=91.197.235.140&id=o-AEBYXP-XC_d37GuNxzLDs80kWRZA7DtEAmVmcJ6noelG&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278&source=youtube&requiressl=yes&spc=lT-Khgsilkwj_0IQiIO36zTcLX-N-DI&vprv=1&mime=video%2Fwebm&ns=CoVFZ7E3XXu7iUUa-hYK5aYH&gir=yes&clen=20825004&dur=156.240&lmt=1565307827720559&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5535432&n=6FIxAoOOmOCy9Q&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRAIgNHW9IVlxxK841-Ke_d6INgXXnXZwoC9yrnzQ7AzlBkwCICXyyxK1sXI75y1DhdI6NZb3udtuaJqcnILUwV3sww-s&redirect_counter=1&cm2rm=sn-q0ce77l&req_id=e94159257860a3ee&cms_redirect=yes&mh=kC&mip=181.211.10.243&mm=34&mn=sn-q4fl6nsr&ms=ltu&mt=1658406524&mv=m&mvi=1&pl=21&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhAOokepN7x5_LLENmN1vyzRRqgFkyYJOFCPu_3HPMVYqxAiEA4uBpq87VYflSUqKvl5HKIa1Glo4YDACpOYpMhYv9iCE%3D",
                "https://rr1---sn-q4fl6nsr.googlevideo.com/videoplayback?expire=1658428547&ei=I0jZYurrJqHTxN8P8ZOEwA0&ip=110.74.206.144&id=o-AD5w0OCiychg6jmDhwJwnpRzBeQtqsGmA90UH4mqhC9a&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&spc=lT-KhuGtY5NUlD_EuhSrn9ibXu3urt4&vprv=1&mime=video%2Fwebm&ns=Q0TQXEpJ-FyDJxA4i3X-pHQH&gir=yes&clen=26550009&dur=188.200&lmt=1614395845236100&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=1432434&n=k2wq6jx6CymuYw&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIgaNY8xaLcHvCWljuFC0LRasCjg-7DCxvmS9f7E44fYz4CIQCN5DjGaAXp_i2Tmb4_62uAev0S3Xw77_QleZ9gqvvcqg%3D%3D&rm=sn-uxajvuxji-2ois7e&req_id=784a8665eceda3ee&cmsv=e&redirect_counter=2&cm2rm=sn-30ald7z&cms_redirect=yes&mh=YK&mip=181.211.10.243&mm=34&mn=sn-q4fl6nsr&ms=ltu&mt=1658406524&mv=m&mvi=1&pl=21&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgJTqgxNXPzuLTOdpfOQ-1MSOmdSQRPcckb3pSCITxgGgCID0OWZME2tJGAyRHeWtii-3DMctL_SDmAD-n2w05Mscq",
                "https://rr4---sn-q4flrnsk.googlevideo.com/videoplayback?expire=1658428613&ei=ZEjZYsetOfW3mLAP2pKXmAs&ip=147.78.226.93&id=o-AIk0WB5MgqLz78nbMZBhH0-MMYNLoMM2p7629ECHF2Dp&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&spc=lT-Khlcj-8EQHnSRv0p172uRs0kcUAE&vprv=1&mime=video%2Fwebm&gir=yes&clen=34759218&dur=145.103&lmt=1540086216846348&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5432432&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRAIgNuBdSCVAaVVK1ZRlFF0sf_8fZDg__JfYq2X-bn1WnkoCICaXj-rZV1Vnqr9rI08ziQX6qClvjwbRoQ7LAyYxHWPY&redirect_counter=1&cm2rm=sn-aigedl7s&req_id=5752bd3ac841a3ee&cms_redirect=yes&mh=4m&mip=181.211.10.243&mm=34&mn=sn-q4flrnsk&ms=ltu&mt=1658406524&mv=m&mvi=4&pl=21&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAPHTG8RpSF1LGvLV4RW5ZzONDQH8Oqy3yQ32Qf5SDJSnAiAnIoPUE5T2nvPHNqUhA9MkCO1BKAgQTYVw72_th7UdJg%3D%3D",
                "https://rr1---sn-jou-btxy.googlevideo.com/videoplayback?expire=1658428242&ei=8kbZYoKbFovtigTbsoTwBA&ip=205.185.214.187&id=o-AJNt-4B5KbApCC6QLoFY7RDAFyOAwidYVXaBCD7TtV23&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&spc=lT-KhtMl-DlF0ZyeiSH_hY0eu1EDstI&vprv=1&mime=video%2Fwebm&ns=nGCKKsmsWOXxqtqYFHUgg14H&gir=yes&clen=28486266&dur=156.920&lmt=1649010509980546&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5535434&n=ojRaenCOnvbmNw&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIga_2XDIZ0V0Es6CVEKm4LXD9qNe2h7SxOiSZ0z3DHDrICIQDccKJh4OzrCnvFx-_2O5kcUhU4C8Hpm0H2xUiKmaibyw%3D%3D&redirect_counter=1&rm=sn-q4fe7z7z&req_id=3f5b5a059010a3ee&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=_7&mip=181.211.10.243&mm=31&mn=sn-jou-btxy&ms=au&mt=1658406546&mv=m&mvi=1&pl=21&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAOI697Z2juYnulLF4CAUuEpHkwHGyfQgYtHhMUuD0WeAAiB5RxB5LXCdcneUKH7N22Ecq6c3RwOobHbMqNFa1Dqntw%3D%3D",
                "https://rr2---sn-jou-btxy.googlevideo.com/videoplayback?expire=1658428588&ei=TEjZYv65JYqyW__2qeAD&ip=91.90.124.12&id=o-AF6pTFdp_oKTMZbHCa3F8ELgexfgWPJP36rQ-psTvxtp&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278&source=youtube&requiressl=yes&spc=lT-KhmKNRkRRFBWAPL1LyY1fQ6YHEOM&vprv=1&mime=video%2Fwebm&ns=w5jVwCt-U1bVm-fM_1wewAcH&gir=yes&clen=29354646&dur=97.360&lmt=1449726730978666&keepalive=yes&fexp=24001373,24007246&c=WEB&n=O-s5GY3ctZm4qg&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIhALV6oUaIcvUZLBRZtrqhV90jrrEdpdEVph6eZgVS_AByAiB94t-_EEdbPvdx2JC0NNt7mC7QkXuX-o5XXIU1dcSrBw%3D%3D&redirect_counter=1&rm=sn-aige667z&req_id=cc213cb39a8ca3ee&cms_redirect=yes&ipbypass=yes&mh=OT&mip=181.211.10.243&mm=31&mn=sn-jou-btxy&ms=au&mt=1658406546&mv=m&mvi=2&pl=21&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgOaulxk_uIaryNnK3-nuQAVhIv_pkasLPXtSFYyQspiMCIQD_rGucWoP_v84QaIbTe206D6xsNSzrqN78SJ-NWqdZ8Q%3D%3D",
                "https://rr2---sn-q4flrnld.googlevideo.com/videoplayback?expire=1658428525&ei=DUjZYr_iMsSAy_sPkNKokA4&ip=209.107.196.45&id=o-ACeF5KwBl8elGgyMZaNpC46RdEgKmq38QEWkbGsD1I9o&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278&source=youtube&requiressl=yes&spc=lT-KhqoTsFKHVX80AkIygygpKU6QGj0&vprv=1&mime=video%2Fwebm&ns=DGriSxHDOJeAoeqK9MoRRecH&gir=yes&clen=16809559&dur=147.080&lmt=1642298698332783&keepalive=yes&fexp=23886208,24001373,24007246&beids=23886208&c=WEB&txp=5316224&n=TRfqDDEkho2A_A&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIgZPYt5VL1PDnZj7eBOVpVCRyC0pCTiHDW5L9upzbOHV8CIQDNN_P9QqX9a6DhYxqkFBRHEUvQbHEXuN71VUASfDxYCw%3D%3D&redirect_counter=1&cm2rm=sn-5uaees7s&req_id=34092b41d093a3ee&cms_redirect=yes&cmsv=e&mh=oE&mip=181.211.10.243&mm=34&mn=sn-q4flrnld&ms=ltu&mt=1658406277&mv=u&mvi=2&pl=21&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhAM4-KgFdwKZkqAj4z7r19UQhX6YIJheBJf8LlCX5pjzOAiEAixaiqqWY0eR4HWtL5G00EAIZsR6C1RqHKyBxFeqKdYc%3D",
                "https://rr2---sn-cvb7lne7.googlevideo.com/videoplayback?expire=1658428254&ei=_kbZYuLBGNeZsfIPsqCToAg&ip=64.145.76.75&id=o-ANKhPAEREDuyKq2LlZn491uUtr8cwxwS7P4Uf5KTPdij&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&spc=lT-Khq5ucRkd8H3F2JtHC1_tu01-KLg&vprv=1&mime=video%2Fwebm&ns=e8j7H72p04HAuSEKoO3IufkH&gir=yes&clen=40827871&dur=208.833&lmt=1542427183554444&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5432432&n=r-FFSMgAq7oaxg&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIgDyp-uuRCciAJ5xmfZe1-THpwIAPfF_Ftprj2vcjmBT4CIQDKK7pK2YBD3tekMLFms2qqY7YDM9INDTdAgxzoe1LFJw%3D%3D&rm=sn-a5mdy7l&req_id=8fe6f7dffa8ba3ee&ipbypass=yes&cm2rm=sn-jou-btxy7e,sn-jou-btxl76&redirect_counter=3&cms_redirect=yes&cmsv=e&mh=Aa&mip=181.211.10.243&mm=30&mn=sn-cvb7lne7&ms=nxu&mt=1658406516&mv=m&mvi=2&pl=21&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgVK7Ni7-uismuNPVs0h83M2n44vQsXrLMS-ksJFg6KNsCIQCwSNIvTyFrCnXn_FLEz20ZjDIBg9wAdJf67vmK2wOOig%3D%3D",
                "https://rr5---sn-o097znsk.googlevideo.com/videoplayback?expire=1658428346&ei=WkfZYpmpKtiOsfIPk7OwWA&ip=216.131.122.45&id=o-ACZwarzamT2Lw2TBTg1e6SSKC5BIjs8CfwsNul4TDwzP&itag=247&aitags=133%2C134%2C135%2C136%2C160%2C242%2C243%2C244%2C247%2C278%2C394%2C395%2C396%2C397%2C398&source=youtube&requiressl=yes&spc=lT-Khi-e5aXwYb4qF6616bZi1Li7Tts&vprv=1&mime=video%2Fwebm&ns=vceCHF65Ds89yZyie5KmajgH&gir=yes&clen=12168411&dur=97.320&lmt=1540748422308475&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5432432&n=IQBqTHbCxxWf2g&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIgG9p9iJtObggP1AC6eUX3iqaTiQAcffED9IS_VHsm6RsCIQD_vfHvu8OE9lBD0kpvOt4IW-_Vc8aTulJz6GndiEd27Q%3D%3D&redirect_counter=1&rm=sn-8xgp1vo-nh4e76&req_id=941424d0f436a3ee&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=jf&mm=29&mn=sn-o097znsk&ms=rdu&mt=1658406549&mv=m&mvi=5&pl=23&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgOYLf-ZLm-LpPgalq4c9XdowOEoiiQ-PdcOyP8mbvI1gCIHQTL5hTPZ2oFtq_dMciVd44URlp38De5fouHnGcDwLd",
                "https://rr1---sn-jou-btxy.googlevideo.com/videoplayback?expire=1658428389&ei=hUfZYvzQI7GO2LYP0LuMiAI&ip=216.151.191.98&id=o-AG2RiJG0SaxXauHL92KCzrvTMWB6bfp7Ssf6zsCwiLKM&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278&source=youtube&requiressl=yes&spc=lT-KhjhEboDso9mxMDzHKDgtL1u2Adk&vprv=1&mime=video%2Fwebm&ns=jHihtabPkIkfMsV928X-YxEH&gir=yes&clen=19923854&dur=174.291&lmt=1589947177292336&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=2316222&n=Kym4U5kcvW9ZVg&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIgYy8CTqjzzIA_OIbjM7e4rUuXEBuvGR0HhNTTJ3BF4ZICIQCEv3EGJfX6vUOCjngHEXiq-lPYhtGDCU7V_kdG3kWUdA%3D%3D&redirect_counter=1&rm=sn-p5qe7676&req_id=d31abaef9d00a3ee&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=YM&mip=181.211.10.243&mm=31&mn=sn-jou-btxy&ms=au&mt=1658406290&mv=u&mvi=1&pcm2cms=yes&pl=21&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pcm2cms,pl&lsig=AG3C_xAwRQIhAJLlljs860cVhh34gTBsReV4OkuFAeV5i-szRTP15m8uAiAVHLvPPvKPE1Yb-YY16gxp_GYjWGqcik_NzpuGneJepA%3D%3D",
                "https://rr3---sn-vgqsrnlk.googlevideo.com/videoplayback?expire=1658428369&ei=cUfZYsD-HN7tyQXL_IeYBw&ip=84.247.50.250&id=o-APFns7wslq9D6_Bl6dPfDA1GyZbKHKQraw7I682iG_vm&itag=244&aitags=133%2C134%2C135%2C160%2C242%2C243%2C244%2C278%2C394%2C395%2C396%2C397&source=youtube&requiressl=yes&spc=lT-Khi2pUV8ljrK3_3K-5tLplNZ5IUc&vprv=1&mime=video%2Fwebm&ns=nETxNnHhvhKihFbArC5XyOUH&gir=yes&clen=6401204&dur=125.325&lmt=1541910258209944&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5432432&n=qUoBYxkMZ2caxQ&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIgFN225vZ3NWRpYBmwt81WG1K0DVMsW6ood8yq3_NeTPgCIQCM5E_MpuMrqNd6JxmzuEVlkKsMN1pel7JW93p7U5Qhug%3D%3D&redirect_counter=1&cm2rm=sn-5gos776&req_id=5e50c0540153a3ee&cms_redirect=yes&cmsv=e&mh=bR&mip=181.211.10.243&mm=34&mn=sn-vgqsrnlk&ms=ltu&mt=1658406277&mv=D&mvi=3&pl=0&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAOeZ2CgPW2-iya9FaCGN4cx3IQay8gAaPgDgv4led5i-AiACpRNSjXQ72aJJw50Hrx27Iwt2VApilj0HA-pUldy0nw%3D%3D",
                "https://rr4---sn-cvb7lnl7.googlevideo.com/videoplayback?expire=1658428289&ei=IUfZYrqVB5GY2_gP0rS6qAQ&ip=191.96.67.225&id=o-ACw-8nqj2FNxoSZadypzC43Natl2AGEm9f7vSJoDgWUh&itag=248&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&spc=lT-KhlLD4gPd66SkhUK9P58GYWXvHqk&vprv=1&mime=video%2Fwebm&ns=2vMO8_fZ6VNHdAVB6BV_exIH&gir=yes&clen=24737260&dur=152.520&lmt=1538168068766735&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5533432&n=3GLoZfH1hOdRlQ&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRAIgahJSEDAftYQ9WjbzPaiI_lNG1YTbJFYp2a0Onf8FScoCICXFC81rhoPOvbQ2AQlk5S64etklMVkILCho1XQFizZu&rm=sn-q4feey7l&req_id=fc9f304224cda3ee&ipbypass=yes&cm2rm=sn-jou-btxy7l,sn-jou-btxl7z&redirect_counter=3&cms_redirect=yes&cmsv=e&mh=C5&mip=181.211.10.243&mm=30&mn=sn-cvb7lnl7&ms=nxu&mt=1658406516&mv=m&mvi=4&pl=21&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAOyPhq8RcRU8ybikzhJSvd6URHzCK1mkHApdn2TgcvEwAiBLSWQ3G-GKwPp-uGW02xwj3Izsnfjj2cytQtakrIIG4w%3D%3D",
                "https://rr1---sn-cvb7lnee.googlevideo.com/videoplayback?expire=1658428206&ei=zkbZYo74JKPAmLAPirypyAs&ip=45.133.172.19&id=o-AIC2FM6yhbvI30pBothqTGaw5tWFwwchfJrECFFKvDLu&itag=247&aitags=133%2C134%2C135%2C136%2C160%2C242%2C243%2C244%2C247%2C278%2C394%2C395%2C396%2C397%2C398&source=youtube&requiressl=yes&spc=lT-Khijyz70VaH3K9SKcu9wk0BeeW_I&vprv=1&mime=video%2Fwebm&ns=oQIBeckLno_UPsEyijUjg8kH&gir=yes&clen=18921637&dur=148.648&lmt=1541882370770860&keepalive=yes&fexp=24001373,24007246&c=WEB&txp=5432432&n=TQTk_ONZSZ7hAA&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRAIgE4KLJgIMaXKRLrpHVk-QvoISiuMOMWOS0XuTWhvTwvICIHO-Wb2NyoeuJo-Ev0q-MBf8KeAGspbnqQTrE72o4feB&rm=sn-aige6d7l&req_id=dfafec5481baa3ee&ipbypass=yes&cm2rm=sn-jou-btxy7l,sn-jou-btxl76&redirect_counter=3&cms_redirect=yes&cmsv=e&mh=kR&mip=181.211.10.243&mm=30&mn=sn-cvb7lnee&ms=nxu&mt=1658406516&mv=m&mvi=1&pl=21&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhANh9gmFiP54PnsFzEw4L43Ujb_pGX9EJi-kcGka9176pAiEAsId39cAwwNLdjZ6EM9YzSt2fmWNHTO-0C2l9hs1sa44%3D"
        };
        String bgImageUrl[] = {
                "https://imagenes.elpais.com/resizer/30naubhTD9A271LIBFszSmiqvpY=/1960x1470/cloudfront-eu-central-1.images.arcpublishing.com/prisa/JEEL63TIUO57KHQ36EDO2A5YUU.jpg",
                "https://venngage-wordpress-pt.s3.amazonaws.com/uploads/2019/04/vingadores-artigo.png",
                "https://static01.nyt.com/images/2017/06/21/arts/21TRANSFORM1/21TRANSFORM1-videoSixteenByNineJumbo1600.jpg",
                "https://media.vandal.net/i/1200x630/5-2022/20225249591528_1.jpg",
                "https://i.ytimg.com/vi/GwxT63R0XSI/maxresdefault.jpg",
                "https://s3.amazonaws.com/static.rogerebert.com/uploads/review/primary_image/reviews/jumper-2008/EB20080213REVIEWS703454342AR.jpg",
                "https://finde.latercera.com/wp-content/uploads/2020/04/Misi%C3%B3n-de-rescate-3.jpg",
                "https://laestatuilla.com/wp-content/uploads/2020/11/Estacion-Zombie-2-peninsula-01.jpg",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/la-vieja-guardia-historia-amor-joe-nicky-1594719324.jpg",
                "https://i.blogs.es/cb9314/caballero-oscuro/1366_2000.jpeg",
                "https://i.blogs.es/ac0d48/carnage-in-venom-let-there-be-carnage-movie-trailer/450_1000.jpeg",
                "https://www.cinemascomics.com/wp-content/uploads/2011/03/Fast-Five-2011.jpg"
        };
        String cardImageUrl[] = {
                "https://img.aullidos.com/imagenes/caratulas/bumblebee-christmas.jpg",
                "https://m.media-amazon.com/images/I/71niXI3lxlL.jpg",
                "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/54d8d22e16fc1162de72ad15ca49014ce47e0fd4f8030c992e5da68224827ccb._RI_V_TTW_.jpg",
                "https://phantom-marca.unidadeditorial.es/cbf6e302019427387f6d8f63b2b90015/resize/1320/f/jpg/assets/multimedia/imagenes/2022/03/28/16484887998480.png",
                "https://www.eluniverso.com/resizer/Ew8R1Xp5LZPNNHLITlZ6L2asfZ0=/349x489/smart/filters:quality(70)/cloudfront-us-east-1.images.arcpublishing.com/eluniverso/QWJ45YF6URCWXLZE55WV5QEHTM.jpg",
                "https://m.media-amazon.com/images/I/51WFxt1uzSL.jpg",
                "https://www.humonegro.com/wp-content/EXTRACTION-FRONTAL.png",
                "https://s3-us-west-2.amazonaws.com/joinnus.com/user/2/5f04fabc65d1b.jpg",
                "https://larepublica.pe/resizer/kHuOgzTL59bFb6_JcDNVxFeLp64=/1200x660/top/cloudfront-us-east-1.images.arcpublishing.com/gruporepublica/YIPAMCM6DNHYZECAEL4BRQG5AU.jpg",
                "https://i.blogs.es/f576d8/otro-20poster-20de-20dark-20knight/450_1000.jpg",
                "https://m.media-amazon.com/images/I/81QmDT99wsL._SL1500_.jpg",
                "https://m.media-amazon.com/images/I/81M4sBx7KFL._SL1500_.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description[index],
                            studio,
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}