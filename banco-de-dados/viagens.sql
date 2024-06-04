--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: destinos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.destinos (
    nome character varying(255) NOT NULL,
    descricao character varying(255) NOT NULL,
    id integer NOT NULL
);


ALTER TABLE public.destinos OWNER TO postgres;

--
-- Name: destinos_id_novo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.destinos_id_novo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.destinos_id_novo_seq OWNER TO postgres;

--
-- Name: destinos_id_novo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.destinos_id_novo_seq OWNED BY public.destinos.id;


--
-- Name: reservas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.reservas (
    id_usuario integer,
    id_destino integer,
    data date,
    status character varying(255) DEFAULT 'pendente'::character varying,
    id integer NOT NULL
);


ALTER TABLE public.reservas OWNER TO postgres;

--
-- Name: reservas_id_novo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.reservas_id_novo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.reservas_id_novo_seq OWNER TO postgres;

--
-- Name: reservas_id_novo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.reservas_id_novo_seq OWNED BY public.reservas.id;


--
-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuarios (
    nome character varying(255) NOT NULL,
    email character varying(255) NOT NULL,
    data_nascimento date NOT NULL,
    id integer NOT NULL,
    rua character varying(100),
    numero character varying(10),
    cidade character varying(50),
    estado character varying(50)
);


ALTER TABLE public.usuarios OWNER TO postgres;

--
-- Name: usuarios_id_novo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuarios_id_novo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.usuarios_id_novo_seq OWNER TO postgres;

--
-- Name: usuarios_id_novo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuarios_id_novo_seq OWNED BY public.usuarios.id;


--
-- Name: destinos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.destinos ALTER COLUMN id SET DEFAULT nextval('public.destinos_id_novo_seq'::regclass);


--
-- Name: reservas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reservas ALTER COLUMN id SET DEFAULT nextval('public.reservas_id_novo_seq'::regclass);


--
-- Name: usuarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios ALTER COLUMN id SET DEFAULT nextval('public.usuarios_id_novo_seq'::regclass);


--
-- Data for Name: destinos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.destinos (nome, descricao, id) FROM stdin;
Praia das Tartarugas	Uma bela praia com areias brancas e mar cristalino	1
Cachoeira do Vale Verde	Uma cachoeira exuberante cercada por natureza	2
Cidade Hist¢rica de Pedra Alta	Uma cidade rica em hist¢ria e arquitetura	3
Praia Teste	Destino paradis¡aco com belas praias.	4
\.


--
-- Data for Name: reservas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.reservas (id_usuario, id_destino, data, status, id) FROM stdin;
1	2	2023-07-10	confirmada	1
2	1	2023-08-05	pendente	2
4	4	2023-07-01	pendente	3
\.


--
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuarios (nome, email, data_nascimento, id, rua, numero, cidade, estado) FROM stdin;
Maria Santos	maria@example.com	1985-08-22	1	Rua B	456	Cidade Y	Estado Z
Pedro Souza	pedro@example.com	1998-02-10	2	Avenida C	789	Cidade X	Estado Y
JoÆo Silva	joao@example.com	1990-05-15	3	Nova Rua	123		
JoÆo Maria	joaomaria@example.com	1990-01-01	4	Rua A	123		
Usuario sem reservas	semreservar@teste.com	1990-10-10	5	Rua	123	cidade	estado
JoÆo Silva	joao.silva@example.com	1990-01-01	6	Rua A	\N	\N	\N
Maria Santos	maria.santos@example.com	1992-03-15	7	Rua B	\N	\N	\N
Pedro Almeida	pedro.almeida@example.com	1985-07-10	8	Rua C	\N	\N	\N
Ana Oliveira	ana.oliveira@example.com	1998-12-25	9	Rua D	\N	\N	\N
Carlos Pereira	carlos.pereira@example.com	1991-06-05	10	Rua E	\N	\N	\N
Laura Mendes	laura.mendes@example.com	1994-09-12	11	Rua F	\N	\N	\N
Fernando Santos	fernando.santos@example.com	1988-02-20	12	Rua G	\N	\N	\N
Mariana Costa	mariana.costa@example.com	1997-11-30	13	Rua H	\N	\N	\N
Ricardo Rodrigues	ricardo.rodrigues@example.com	1993-04-18	14	Rua I	\N	\N	\N
Camila Alves	camila.alves@example.com	1989-08-08	15	Rua J	\N	\N	\N
Bruno Carvalho	bruno.carvalho@example.com	1995-03-25	16	Rua K	\N	\N	\N
Amanda Silva	amanda.silva@example.com	1996-12-02	17	Rua L	\N	\N	\N
Paulo Mendon‡a	paulo.mendonca@example.com	1999-07-20	18	Rua M	\N	\N	\N
Larissa Oliveira	larissa.oliveira@example.com	1987-10-15	19	Rua N	\N	\N	\N
Fernanda Sousa	fernanda.sousa@example.com	1992-05-08	20	Rua O	\N	\N	\N
Gustavo Santos	gustavo.santos@example.com	1993-09-18	21	Rua P	\N	\N	\N
Helena Costa	helena.costa@example.com	1998-02-22	22	Rua Q	\N	\N	\N
Diego Almeida	diego.almeida@example.com	1991-11-27	23	Rua R	\N	\N	\N
Juliana Lima	juliana.lima@example.com	1997-04-05	24	Rua S	\N	\N	\N
Rafaela Silva	rafaela.silva@example.com	1996-01-10	25	Rua T	\N	\N	\N
Lucas Pereira	lucas.pereira@example.com	1986-08-30	26	Rua U	\N	\N	\N
F bio Rodrigues	fabio.rodrigues@example.com	1989-03-12	27	Rua V	\N	\N	\N
Isabela Santos	isabela.santos@example.com	1994-12-07	28	Rua W	\N	\N	\N
Andr‚ Alves	andre.alves@example.com	1995-09-28	29	Rua X	\N	\N	\N
Clara Carvalho	clara.carvalho@example.com	1990-02-15	30	Rua Y	\N	\N	\N
Roberto Mendes	roberto.mendes@example.com	1992-07-21	31	Rua Z	\N	\N	\N
Mariana Oliveira	mariana.oliveira@example.com	1997-05-03	32	Av. A	\N	\N	\N
Gustavo Costa	gustavo.costa@example.com	1998-11-16	33	Av. B	\N	\N	\N
Lara Sousa	lara.sousa@example.com	1993-06-09	34	Av. C	\N	\N	\N
Pedro Lima	pedro.lima@example.com	1996-09-27	35	Av. D	\N	\N	\N
\.


--
-- Name: destinos_id_novo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.destinos_id_novo_seq', 4, true);


--
-- Name: reservas_id_novo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.reservas_id_novo_seq', 3, true);


--
-- Name: usuarios_id_novo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuarios_id_novo_seq', 35, true);


--
-- Name: destinos destinos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.destinos
    ADD CONSTRAINT destinos_pkey PRIMARY KEY (id);


--
-- Name: reservas reservas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reservas
    ADD CONSTRAINT reservas_pkey PRIMARY KEY (id);


--
-- Name: usuarios usuarios_nova_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_nova_email_key UNIQUE (email);


--
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);


--
-- Name: idx_nome; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX idx_nome ON public.usuarios USING btree (nome);


--
-- Name: reservas fk_reservas_destinos; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reservas
    ADD CONSTRAINT fk_reservas_destinos FOREIGN KEY (id_destino) REFERENCES public.destinos(id);


--
-- Name: reservas fk_reservas_usuarios; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reservas
    ADD CONSTRAINT fk_reservas_usuarios FOREIGN KEY (id_usuario) REFERENCES public.usuarios(id) ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

